package com.wesper.linkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList b = new LinkedList(); //Когда пустой список Просто добавим элемент
        b.addInPosition(1,1);

        LinkedList c = new LinkedList(); //Когда список из 1 элемента и Добавляем в начало
        c.addBack(2);
        c.addInPosition(1, 1);

        LinkedList d = new LinkedList(); //Когда список из 1 элемента и Добавляем в конец
        d.addBack(1);
        d.addInPosition(2, 2);

        LinkedList e = new LinkedList(); //Если список из 2 элементов и добавляем В начало
        e.addBack(2);
        e.addBack(3);
        e.addInPosition(1, 1);

        LinkedList f = new LinkedList(); //Если список из 2 элементов и добавляем В конец
        f.addBack(1);
        f.addBack(2);
        f.addInPosition(3, 3);

        LinkedList g = new LinkedList(); //Если список из 2 элементов и добавляем В конец
        g.addBack(1);
        g.addBack(3);
        g.addInPosition(2, 2);

        g.addInPosition(-1, 7); //Когда индекс за пределами списка

        g.printLength();

        //------------------------------

        LinkedList h = new LinkedList(); //Когда список из 1 элемента
        h.addBack(1);
        h.deleteInPosition(1);

        LinkedList i = new LinkedList(); //Когда список из 2 элементов, удаление 1 эемента
        i.addBack(1);
        i.addBack(2);
        i.deleteInPosition(1);

        LinkedList j = new LinkedList(); //Когда список из 2 элементов, удаление 2 эемента
        j.addBack(1);
        j.addBack(2);
        j.deleteInPosition(2);

        LinkedList k = new LinkedList(); //Когда список из 3 элементов, удаление 1 эемента
        k.addBack(1);
        k.addBack(2);
        k.addBack(3);
        k.deleteInPosition(1);

        LinkedList l = new LinkedList(); //Когда список из 3 элементов, удаление 2 эемента
        l.addBack(1);
        l.addBack(2);
        l.addBack(3);
        l.deleteInPosition(2);

        LinkedList m = new LinkedList(); //Когда список из 3 элементов, удаление 3 эемента
        m.addBack(1);
        m.addBack(2);
        m.addBack(3);
        m.deleteInPosition(3);

        LinkedList n = new LinkedList(); //Когда список пуст, удаление 0 эемента
        n.deleteInPosition(0);

        LinkedList o = new LinkedList(); //Индекс за пределами списка
        o.addBack(1);
        o.addBack(2);
        o.addBack(3);
        o.deleteInPosition(4);

        //------------------------------
        LinkedList p = new LinkedList();
        p.setValueInPosition(0, 0); //Редактирование элемента в пустом списке

        LinkedList r = new LinkedList(); //Когда список из 1 элемента, редактирование 1 элемента
        r.addBack(1);
        r.setValueInPosition(1, 2);

        LinkedList s = new LinkedList(); //Когда список из 2 элементов, редактирование 1 и 2 элементов
        s.addBack(1);
        s.addBack(2);
        s.setValueInPosition(1, 3);
        s.setValueInPosition(2, 3);

        LinkedList t = new LinkedList(); //Когда список из 3 элементов, редактирование 1, 2 и 3 элементов
        t.addBack(1);
        t.addBack(2);
        t.addBack(3);
        t.setValueInPosition(1, 4);
        t.setValueInPosition(2, 5);
        t.setValueInPosition(3, 6);

        LinkedList u = new LinkedList(); //Индекс за пределами списка
        u.addBack(1);
        u.setValueInPosition(2, 3);

        //----------------------
        b.printLength();
        c.printLength();
        d.printLength();
        e.printLength();
        f.printLength();
        g.printLength();
        h.printLength();
        i.printLength();
        j.printLength();
        k.printLength();
        l.printLength();
        m.printLength();
        n.printLength();
        o.printLength();
        p.printLength();
        r.printLength();
        s.printLength();

        //---------------------
        b.printLinkedList();
        c.printLinkedList();
        d.printLinkedList();
        e.printLinkedList();
        f.printLinkedList();
        g.printLinkedList();
        h.printLinkedList();
        i.printLinkedList();
        j.printLinkedList();
        k.printLinkedList();
        l.printLinkedList();
        m.printLinkedList();
        n.printLinkedList();
        o.printLinkedList();
        p.printLinkedList();
        r.printLinkedList();
        s.printLinkedList();

        //---------------------
        LinkedList v = new LinkedList();
        v.addBack(2);
        v.addBack(4);
        v.addBack(6);
        v.addBack(8);
        v.addBack(1);
        v.addBack(3);
        v.addBack(5);
        v.addBack(7);
        v.sortLinkedListDesc();
        System.out.println("Обратно");
        v.sortLinkedListAsc();
    }
}
