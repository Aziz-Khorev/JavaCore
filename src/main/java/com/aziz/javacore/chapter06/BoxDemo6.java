package com.aziz.javacore.chapter06;

/* В данном примере программы  для инициализации размеров
   параллелепипеда в класе Box применяется конструктор
 */
class Box6 {
    double width;
    double height;
    double depth;

    // это конструктор класса Box
    Box6() {
        System.out.println("Конструирование объекта Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    //расчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}


class BoxDemo6 {
    public static void main(String[] args) {
        // объявить, выделить память и инициализировать объекта типа Box
        Box6 mybox1 = new Box6();
        Box6 mybox2 = new Box6();

        double vol;

        // получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);

        // получить оъем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
    }
}
