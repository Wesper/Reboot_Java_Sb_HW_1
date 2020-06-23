package com.wesper.linkedList;

import com.wesper.gsm.Car;

public class LinkedList {

    private ListElement head;
    private ListElement tail;

    class ListElement {
        ListElement next;
        int data;
    }

    /**
     * Добавляет переданный элемент в конец
     * @param data - добавляемый элемент
     */
    public void addBack(int data) {
        ListElement el = new ListElement();
        el.data = data;

        if (tail == null) {
            head = el;
            tail = el;
        } else {
            tail.next = el;
            tail = el;
        }
    }

    /**
     *
     * @param position - позиция, на которой должен оказаться новый элемент
     * @param data - добавляемый элемент
     */
    public void addInPosition(int position, int data) {
        ListElement el = new ListElement();
        ListElement tmp = head;
        el.data = data;
        int i = 1;

        //Если список пустой, просто добавляем элемент
        if (tmp == null) {
            addBack(data);
            return;
        }

        //Если позиция за рамками длины списка + 1, выходим с текстом ошибки
        if (!indexValidation(position)) {
            System.out.println("Некорректный индекс");
            return;
        }

        //Если позиция 1
        if (position == 1) {
            el.next = head;
            head = el;
            return;
        }

        //Если позиция элемента длина списка + 1
        if (position == length() + 1) {
            addBack(data);
            return;
        }

        //Прочие случаи
        while (tmp.next != null) {
            if (i != position - 1) {
                tmp = tmp.next;
                i++;
            }
            else {
                if (tmp.next != null) {
                    el.next = tmp.next;
                    tmp.next = el;
                    break;
                } else {
                    tail.next = el;
                    tail = el;
                    break;
                }
            }
        }
    }

    /**
     *
     * @return возвращает длину списка
     */
    public int length() {
        ListElement el = head;
        int i = 1;
        if (head == null) {
            return 0;
        }
        while (el.next != null) {
            el = el.next;
            i++;
        }
        return i;
    }

    /**
     *
     * @return выводит в консоль длину списка
     */
    public void printLength() {
        System.out.println(length());
    }

    /**
     * Удаляет элемент по переданной позиции
     * @param position - позиция удаляемого элемента
     */
    public void deleteInPosition(int position) {
        ListElement tmp = head;
        int i = 1;

        //Если позиция за рамками длины списка или список пуст, выходим с текстом ошибки
        if (!indexValidation(position)) {
            System.out.println("Некорректный индекс");
            return;
        }

        //Если элемент 1
        if (length() == 1) {
            head = null;
            tail = null;
            return;
        }

        //Если позиция 1
        if (position == 1) {
            head = head.next;
            return;
        }

        //Если элемента 2 и индекс 2
        if (length() == 2 && position == 2) {
            head.next = null;
            tail = head;
            return;
        }

        //Если позиция элемента длина списка
        if (position == length()) {
            while (tmp.next.next != null) {
                tmp = tmp.next;
            }
            tail = tmp;
            tail.next = null;
            return;
        }

        //Прочие случаи
        while (tmp.next != null) {
            if (i != position - 1) {
                tmp = tmp.next;
                i++;
            }
            else {
                tmp.next = tmp.next.next;
                break;
            }
        }
    }

    /**
     * Редактирует значение элемента в переданной позиции на переданное значение
     * @param position - позиция элемента для редактирования
     * @param value - значение элемента для редактирования
     */
    public void setValueInPosition(int position, int value) {
        ListElement tmp = head;
        int i = 1;

        //Если позиция за рамками длины списка или список пуст, выходим с текстом ошибки
        if (!indexValidation(position)) {
            System.out.println("Некорректный индекс");
            return;
        }

        //Если позиция 1
        if (position == 1) {
            head.data = value;
            return;
        }

        //Если позиция элемента длина списка
        if (length() == position) {
            tail.data = value;
            return;
        }

        //Прочие случаи
        while (tmp.next != null) {
            if (i != position - 1) {
                tmp = tmp.next;
                i++;
            }
            else {
                tmp.next.data = value;
                break;
            }
        }
    }

    /**
     * Выводит в консоль содержимое списка
     */
    public void printLinkedList() {
        ListElement el = head;
        if (head == null) {
            System.out.println("Список пуст");
            return;
        }
        while (el != null) {
            System.out.print(el.data + " ");
            el = el.next;
        }
        System.out.println();
    }


    /**
     * Сортировка списка по убыванию
     */
    public void sortLinkedListDesc() {
        ListElement el1 = head;
        ListElement el2 = head.next;
        int tmp;
        for (int i = 1; i < length(); i++) {
            el1 = head;
            el2 = head.next;
            for (int j = i; j < length(); j++) {
                if (el1.data < el2.data) {
                    tmp = el1.data;
                    el1.data = el2.data;
                    el2.data = tmp;
                }
                el1 = el1.next;
                el2 = el2.next;
                printLinkedList();
            }
        }
    }

    /**
     * Сортировка списка по возрастанию
     */
    public void sortLinkedListAsc() {
        ListElement el1 = head;
        ListElement el2 = head.next;
        int tmp;
        for (int i = 1; i < length(); i++) {
            el1 = head;
            el2 = head.next;
            for (int j = i; j < length(); j++) {
                if (el1.data > el2.data) {
                    tmp = el1.data;
                    el1.data = el2.data;
                    el2.data = tmp;
                }
                el1 = el1.next;
                el2 = el2.next;
                printLinkedList();
            }
        }
    }

    /**
     * Проверка корректности переданной позиции
     * @param position - позиция элемента в списке
     * @return true - если позиция корректная, false - если нет
     */
    public boolean indexValidation(int position) {
        if (position > length() + 1 || position < 0) {
            return false;
        } else {
            return true;
        }
    }
}
