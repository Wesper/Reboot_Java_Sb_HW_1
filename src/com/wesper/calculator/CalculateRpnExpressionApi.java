package com.wesper.calculator;

public interface CalculateRpnExpressionApi {

    /**
     * @param data - входная строка с выражением
     * @return упрощенный массив элементов из входной строки, подготовленный для обработки в ОПН
     */
     String[] clearData(String data);

    /**
     * @param data - упрощенный массив элементов из входной строки, подготовленный для обработки в ОПН
     * @return - массив в ОПН
     */
     String[] convertToRpn(String[] data);

    /**
     *
     * @param operation - знак операции
     * @return возвращает приоритет переданной операции
     */
     int getPriority(String operation);

    /**
     *
     * @param operation1 - операция в стеке
     * @param operation2 - операция из входного массива
     * @return true - если operation1 >= operation2, иначе false
     */
     Boolean comparePriority(String operation1, String operation2);

    /**
     * @param data - массив элементов (стек)
     * @param value  - элемент для добавления в стек
     * @return массив элементов (стек) с добавленным элементом
     */
     String[] addToStack(String[] data, String value);

    /**
     * @param data - массив элементов (стек)
     * @return массив элементов (стек) с удаленным элементом
     */
     String[] deleteLastElementFromStack(String[] data);

    /**
     *
     * @param rpn - массив элементов в ОПН
     * @param stack - массив элементов (стек)
     * Добавляет в ОПН массив все элементы из стека до открывающейся скобки
     */
     String[] fromStackToBracket(String[] rpn, String[] stack);

    /**
     *
     * @param stack - массив элементов (стек)
     * Удаление всех элементы из стека до открывающейся скобки, включая ее
     */
     String[] deleteFromStackToBracket(String[] stack);

    /**
     *
     * @param rpn - массив элементов в ОПН
     * @param stack - массив элементов (стек)
     * Добавляет в ОПН массив все элементы из стека, с их удалением из стэка
     */
     String[] fromStackAll(String[] rpn, String[] stack);

    /**
     *
     * @param data - массив элементов в ОПН
     * @return результат выражения
     */
     String calculateRpnExpression(String[] data);


    /**
     *
     * @param data - массив элементов для расчета ОПН
     * @param operation - операция над 2я последними элементами массива
     * @return
     */
     String[] calculate(String[] data, String operation);

    default String evaluateExpression(String data) {
        String[] clear;
        String result;

        clear = clearData(data);
        clear = convertToRpn(clear);
        result = calculateRpnExpression(clear);

        return result;
    }
}
