package com.wesper.calculator;

public class CalculateRpnExpression {

    /**
     * @param data - входная строка с выражением
     * @return упрощенный массив элементов из входной строки, подготовленный для обработки в ОПН
     */
    private String[] clearData(String data) {
        data = data
                .replace(" ", "")
                .replace("--", "+")
                .replace("+-", "-")
                .replace("-+", "-")
                .replace("++", "+")
                .replace("-(", "-1*(");

        String[] simpleSplit = data.split("");

        if (simpleSplit[0].equals("-") && simpleSplit[1].matches("\\d+")) {
            simpleSplit[0] = "±";
        }

        for (int i = 1; i < simpleSplit.length; i++) {
            if ((simpleSplit[i].equals("-") || simpleSplit[i].equals("+")) &&
                    (!simpleSplit[i - 1].matches("\\d+") && !simpleSplit[i - 1].equals(")"))) {
                simpleSplit[i] = "±";
            }
        }

        String[] splitByElements = new String[0];
        String tmp = "";

        for (int i = 0; i < simpleSplit.length; i++) {
            if (simpleSplit[i].matches("\\d+") || simpleSplit[i].equals("±")) {
                tmp = tmp + simpleSplit[i].replace("±", "-");
            } else {
                if ((tmp != "")) {
                    splitByElements = addToStack(splitByElements, tmp);
                    splitByElements = addToStack(splitByElements, simpleSplit[i]);
                    tmp = "";
                } else {
                    splitByElements = addToStack(splitByElements, simpleSplit[i]);
                    tmp = "";
                }
            }
        }
        if (tmp != "") {
            splitByElements = addToStack(splitByElements, tmp);
        }



        return splitByElements;
    }

    /**
     * @param data - упрощенный массив элементов из входной строки, подготовленный для обработки в ОПН
     * @return - массив в ОПН
     */
    private String[] convertToRpn(String[] data) {
        String[] rpn = new String[0];
        String[] stack = new String[0];
//((4/2)+1)
        for (int i = 0; i < data.length; i++) {
            if (data[i].matches("-{0,1}\\d+")) {
                rpn = addToStack(rpn, data[i]);
            } else {
                if (data[i].equals(")")) {
                    rpn = fromStackToBracket(rpn, stack);
                    stack = deleteFromStackToBracket(stack);
                } else {
                    if (stack.length == 0) {
                        stack = addToStack(stack, data[i]);
                    } else {
                        if (comparePriority(stack[stack.length - 1], data[i])) {
                            rpn = addToStack(rpn, stack[stack.length - 1]);
                            stack = deleteLastElementFromStack(stack);
                            stack = addToStack(stack, data[i]);
                        } else {
                            stack = addToStack(stack, data[i]);
                        }
                    }
                }
            }
        }
        rpn = fromStackAll(rpn, stack);

        return rpn;
    }

    /**
     *
     * @param operation - знак операции
     * @return возвращает приоритет переданной операции
     */
    private int getPriority(String operation) {
        int priority = 0;
        switch (operation) {
            case "(":
                priority = 1;
                break;
            case ")":
                priority = 1;
                break;
            case "+":
                priority = 2;
                break;
            case "-":
                priority = 2;
                break;
            case "*":
                priority = 3;
                break;
            case "/":
                priority = 3;
                break;
        }
        return priority;
    }

    /**
     *
     * @param operation1 - операция в стеке
     * @param operation2 - операция из входного массива
     * @return true - если operation1 >= operation2, иначе false
     */
    private Boolean comparePriority(String operation1, String operation2) {
        if (operation2.equals("(")) {
            return false;
        } else {
            if (getPriority(operation1) >= getPriority(operation2)) {
                return true;
            } else {
                return false;
            }
        }
    }

    /**
     * @param data - массив элементов (стек)
     * @param value  - элемент для добавления в стек
     * @return массив элементов (стек) с добавленным элементом
     */
    private String[] addToStack(String[] data, String value) {
        String[] newString = new String[data.length + 1];
        if (data.length > 0) {
            for (int i = 0; i < data.length; i++) {
                newString[i] = data[i];
            }
        }
        newString[newString.length - 1] = value;
        return newString;
    }

    /**
     * @param data - массив элементов (стек)
     * @return массив элементов (стек) с удаленным элементом
     */
    private String[] deleteLastElementFromStack(String[] data) {
        String[] newString = new String[data.length - 1];
        for (int i = 0; i < data.length - 1; i++) {
            newString[i] = data[i];
        }
        return newString;
    }

    /**
     *
     * @param rpn - массив элементов в ОПН
     * @param stack - массив элементов (стек)
     * Добавляет в ОПН массив все элементы из стека до открывающейся скобки
     */
    private String[] fromStackToBracket(String[] rpn, String[] stack) {
        int i = stack.length - 1;
        while (!stack[i].equals("(")) {
            rpn = addToStack(rpn, stack[i]);
            i--;
        }
        return rpn;
    }

    /**
     *
     * @param stack - массив элементов (стек)
     * Удаление всех элементы из стека до открывающейся скобки, включая ее
     */
    private String[] deleteFromStackToBracket(String[] stack) {
        int i = stack.length - 1;
        while (!stack[i].equals("(")) {
            stack = deleteLastElementFromStack(stack);
            i--;
        }
        stack = deleteLastElementFromStack(stack);
        return stack;
    }

    /**
     *
     * @param rpn - массив элементов в ОПН
     * @param stack - массив элементов (стек)
     * Добавляет в ОПН массив все элементы из стека, с их удалением из стэка
     */
    private String[] fromStackAll(String[] rpn, String[] stack) {
        for (int i = stack.length - 1; i >= 0; i--) {
            rpn = addToStack(rpn, stack[i]);
        }
        return rpn;
    }

    //6,10, +, 4, -, 1, 1, 2, *, +, /, 1, +
    /**
     *
     * @param data - массив элементов в ОПН
     * @return результат выражения
     */
    private String calculateRpnExpression(String[] data) {
        String[] result = new String[0];

        for (int i = 0; i < data.length; i++) {
            if (data[i].matches("-{0,1}\\d+")) {
                result = addToStack(result, data[i]);
            } else {
                result = calculate(result, data[i]);
            }
        }

        return result[0];
    }


    /**
     *
     * @param data - массив элементов для расчета ОПН
     * @param operation - операция над 2я последними элементами массива
     * @return
     */
    private String[] calculate(String[] data, String operation) {
        String tmp = null;
        double operator1 = Double.parseDouble(data[data.length - 2]);
        double operator2 = Double.parseDouble(data[data.length - 1]);
        switch (operation) {
            case "+":
                tmp = String.valueOf(operator1 + operator2);
                break;
            case "-":
                tmp = String.valueOf(operator1 - operator2);
                break;
            case "*":
                tmp = String.valueOf(operator1 * operator2);
                break;
            case "/":
                tmp = String.valueOf(operator1 / operator2);
                break;
        }
        data = deleteLastElementFromStack(data);
        data = deleteLastElementFromStack(data);
        data = addToStack(data, tmp);
        return data;
    }

    public String evaluateExpression(String data) {
        String[] clear;
        String result;

        clear = clearData(data);
        clear = convertToRpn(clear);
        result = calculateRpnExpression(clear);

        return result;
    }

}
