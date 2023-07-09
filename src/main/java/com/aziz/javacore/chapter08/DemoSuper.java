package com.aziz.javacore.chapter08;

// Полная реализация класса BoxWeight
class Box2 {
    private double width;
    private double height;
    private double depth;

    // Сконструировать клон объекта
    Box2(Box2 ob) {             // передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // конструктор, применяемый при указании всех размеров
    Box2(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор, применяемый в отсутствие размеров
    Box2() {
        width = -1;   // значение -1 служит для обозначения
        height = -1;  // неинициализированного параллелепипеда
        depth = -1;
    }

    // конструктор применяемый при создании куба
    Box2(double len) {
        width = height = depth = len;
    }

    // расчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}

// Теперь в классе BoxWeight полностью реализованы все конструкторы
class Box2Weight extends Box2 {
    double weight; // вес параллелепипеда

    // сконструировать клон объекта
    Box2Weight(Box2Weight ob) {
        super (ob);
        weight = ob.weight;
    }

    // констурктор, применяемый при указании всех параметров
    Box2Weight(double w, double h, double d, double m) {
        super(w, h, d);  // вызывать конструктор из супер класса
        weight = m;
    }

    // констурктор, применяемый по умолчанию
    Box2Weight() {
        super();
        weight = -1;
    }

    // консутрктор, применяемый при создании куба
    Box2Weight(double len, double m) {
        super(len);
        weight = m;
    }
}
public class DemoSuper {
    public static void main(String[] args) {
        Box2Weight mybox1 = new Box2Weight(10, 20, 15, 34.3);
        Box2Weight mybox2 = new Box2Weight(2, 3, 4, 0.076);
        Box2Weight mybox3 = new Box2Weight(); // по умолчанию
        Box2Weight mycube = new Box2Weight(3, 2);
        Box2Weight myclone = new Box2Weight(mybox1);
        double vol;

        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);
        System.out.println("Вес mybox1 равен " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);
        System.out.println("Вес mybox2 равен " + mybox2.weight);
        System.out.println();

        vol = mybox3.volume();
        System.out.println("Объем mybox3 равен " + vol);
        System.out.println("Вес mybox3 равен " + mybox3.weight);
        System.out.println();

        vol = myclone.volume();
        System.out.println("Объем myclone равен " + vol);
        System.out.println("Вес myclone равен " + myclone.weight);
        System.out.println();

        vol = mycube.volume();
        System.out.println("Объем mycube равен " + vol);
        System.out.println("Вес mycube равен " + mycube.weight);
        System.out.println();
    }
}
