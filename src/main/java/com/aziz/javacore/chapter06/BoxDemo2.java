package com.aziz.javacore.chapter06;

// В этой программе объявляется два объекта класса Box
class Box2 {
    double width;
    double height;
    double depth;
}

class BoxDemo2 {
    public static void main(String[] args) {
        Box2 mybox1 = new Box2();
        Box2 mybox2 = new Box2();
        double vol;

        // присвоить значение переменным экземпляра mybox1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        // присвоить другие значения переменным экземпляра mybox2
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // расчитать объем первого паллелепипеда
        vol = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("Объем равен " + vol);

        // расчитать объем второго паллелепипеда
        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("Объем равен " + vol);
    }
}
