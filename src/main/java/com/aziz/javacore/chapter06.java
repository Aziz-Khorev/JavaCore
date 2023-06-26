package com.aziz.javacore;


import java.util.Stack;

public class chapter06 {}
/* Программа использующая класс Box
   Присвоить исходному файлу имя BoxDemo.java
 */
class Box {
    double width;
    double height;
    double depth;
}
// В этом классе объявляется объект типа Box
class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;

        // присвоить значение переменным экземпляра mybox
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        // расчитать объем паллелепипеда
        vol = mybox.width * mybox.height * mybox.depth;

        System.out.println("Объем равен " + vol);
    }
}


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


// В этой программе применяется метод, введенный в класс Box
class Box3 {
    double width;
    double height;
    double depth;

    // вывести объем параллелепипеда
    void volume() {
        System.out.println("Объем равен ");
        System.out.println(width * height * depth);
    }
}

class BoxDemo3 {
    public static void main(String[] args) {
        Box3 mybox1 = new Box3();
        Box3 mybox2 = new Box3();

        // присвоить значение переменным экземпляра mybox1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        // присвоить другие значения переменным экземпляра mybox2
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // вывести объем первого параллелепипеда
        mybox1.volume();

        // вывести объем второго параллелепипеда
        mybox2.volume();
    }
}


// Теперь метод volume() возвращает объем параллелепипеда

class Box4 {
    double width;
    double height;
    double depth;

    // расчитать и возвратить объем
    double volume() {
        return width * height * depth;

    }
}
class BoxDemo4{
    public static void main(String[] args) {
        Box4 mybox1 = new Box4();
        Box4 mybox2 = new Box4();
        double vol;

        // присвоить значения переменным экземпляра mybox1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        //присвоить другие значения переменным экземпляра mybox2
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);

        // получить оъем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
    }
}


// В этой программе применяется метод с параметрами
class Box5 {
    double width;
    double height;
    double depth;

    // расчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
    // установить размеры параллелепипеда
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}
class BoxDemo5 {
    public static void main(String[] args) {
        Box5 mybox1 = new Box5();
        Box5 mybox2 = new Box5();
        double vol;

        // инициализировать каждый экземпляр класса Box
        mybox1.setDim(10, 20, 15);
        mybox2.setDim(3, 6, 9);

        // получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);

        // получить оъем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
    }
}


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


// В данном примере программы для инициализации размеров
// параллелеппипеда в классе Box применяется параметризированный конструктор
class Box7 {
    double width;
    double height;
    double depth;

    // Это конструктор класса Box
    Box7(double w, double h, double d) {
    width = w;
    height = h;
    depth = d;
}

// рассчитать и возвратить объем
double volume() {
    return width * height * depth;
    }
}

class BoxDemo7 {
    public static void main(String[] args) {
        // объявить, выделить память и инициализировать объекты типа Box
        Box7 mybox1 = new Box7(10,20,15);
        Box7 mybox2 = new Box7(3,6,9);

        double vol;

        // получить объем первого параллеипипеда
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);

        // получить объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
    }
}


// В этом классе определяется целочисленный стек, где можно
// хранить да 10 целочисленных значений
/* class Stack {
    int stck[] = new int[10];
    int tos;

    // инициализировать вершину стека
    Stack() {
        tos = -1;
    }

    // разместить элемент в стеке

    void push(int item) {
        if(tos==9);
        System.out.println("Стек заполнен.");
        else
            stck[++tos] = item;
    }

    // извлечь элемент из стека
    int pop() {
        if(tos < 0) {
            System.out.println("Стек не загружен. ");
            return 0;
        }
        else
            return stck[tos--];
    }
}
 */

class TestStack {
    public static void main(String[] args) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        // разместить числа в стеке
        for(int i=0; i<10; i++) mystack1.push(i);
        for(int i=10; i<20; i++) mystack2.push(i);

        // извлечь эти числа из стека
        System.out.println("Содержимое стека mystack1:");
        for(int i=0; i<10; i++)
            System.out.println(mystack1.pop());

        System.out.println("Содержимое стека mystack2:");
        for(int i=0; i<10; i++);
        System.out.println(mystack2.pop());
    }
}
