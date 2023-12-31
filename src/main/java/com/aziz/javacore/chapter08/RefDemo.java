package com.aziz.javacore.chapter08;

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        Box plainbox = new Box();
        double vol;

        vol = weightbox.volume();
        System.out.println("Объем weightbox равен " + vol);
        System.out.println("Объем weightbox равен " + weightbox.weight);
        System.out.println();

        // Присвоить переменной ссылки на объект типа BoxWeight
        // ссылку на объекта типа Box
        plainbox = weightbox;
        vol = plainbox.volume(); // Верно, так как метода volume() определен в классе Box
        System.out.println("Объекм plainbox равен " + vol);

        /* Слудующий опереатор ошибочен, поскольку член plainbox
        не определяет член weight.
       */
        // System.out.println("Вес plainbox равен " + plainbox.weight);
    }
}
