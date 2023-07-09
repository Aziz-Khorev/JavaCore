package com.aziz.javacore.chapter07;
/* В данном примере конструктороы определяются в классе Box
для инициализации размеров параллелиппипеда тремя разными способами
 */
public class Box {
    double width;
    double height;
    double depth;

    // конструктор, используемый, когда используются все размеры
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор, используемый, когда ни один из размеров не указан
    Box() {
        width = -1;   // использовать значение -1 для обозначения
        height = -1;  // не инициализированного параллелепипеда
        depth = -1;
    }

    // конструктор, используемый при создании куьа
    Box(double len) {
        width = height = depth = len;
    }

    // расчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}
class OverloadCons {
    public static void main(String[] args) {
        // создать параллелепипеды, используя разные кострукторы
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        double vol;

        // получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);

        // получить объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);

        // получить объем куба
        vol = mycube.volume();
        System.out.println("Объем mycube равен " + vol);
    }
}