package com.aziz.javacore;
public class chapter03 {}
    // Вычислить расстояние , проходимое светом,
// используя переменные типа long
    class Light {
        public static void main(String args []) {
            int lightspeed;
            long days;
            long seconds;
            long distance;

// приблизительная скорость света, миль в секунду
            lightspeed = 186000;
            days = 1000; // указать количества дней
            seconds = days * 24 * 60 * 60; // преобразовать в секунды
            distance = lightspeed * seconds; // вычислить расстояние
            System.out.print("Зa " + days);
            System.out.print(" дней свет пройдет около ");
            System.out.println(distance + " миль.");
        }
    }



// Вычислить площадь круга
class Area {
    public static void main (String args[]) {
        double pi, r, a;
        r = 10.8;       // радиус окружности
        pi = 3.1416;    // приблизительное значение числа пи
        a = pi * r * r;  // вычислить площадь круга
        System.out.println ("Плoщaдь круга равна " + a);
    }
}


// Продемонстрировать применение типа данных char
class CharDemo {
    public static void main (String args[]) {
        char ch1, ch2;

        ch1 = 88; // код символа Х
        ch2 = 'У';

        System.out.print("ch1 и ch2: ");
        System.out.println(ch1 + " " + ch2);
    }
}

// Символьные переменные ведут себя как целочисленные значения
class CharDemo2 {
    public static void main(String args[]) {
        char ch1;

        ch1 = 'Х';
        System.out.println("ch1 содержит " + ch1);

        ch1++; // увеличить на единицу значение переменной chl
        System.out.println("ch1 теперь содержит " + ch1);
    }
}


// Продемонстрировать применение значений типа boolean
class BoolTest {
    public static void main(String args[]) {
    boolean b;

    b = false ;
System.out.println("b равно " + b );
    b = true ;
System.out.println("b равно " + b );

// значение типа boolean может управлять оператором if
if (b) System.out.println("Этoт код выполняется.");
    b = false;
if(b) System.out.println ("Этoт код не выполняется.");

// результат сравнения - значение типа boolean
System.out.println("10 > 9 равно " + (10 > 9 ));
    }
}

// В этом примере демонстрируе тся динамическая инициализация
class DynInit {
    public static void main(String args[]) {
        double a = 3.0, b = 4.0;
// динамическая инициализация переменной с
        double c = Math.sqrt(a * a + b * b);
        System.out.println("Гипoтeнyзa равна " + c);
    }
}


// Продемонстрировать область действия блока кода
class Scope {
    public static void main(String args[]) {
        int x; // эта переменная доступна всему коду из метода lll&in ()
        x = 10;
        if (x == 10) { // начало новой области действия
            int y = 20; // доступной только этому блоку кода
// обе переменные х и у доступны в э той области действия
            System.out.println(" x и у: " + x + " " + y);
            x = y * 2;
        }
// у = 100; // ОШИБКА ! переменная y недоступна
// в этой области действия , тогда как
// переменная х доступна и эдесь
        System.out.println(" x равно " + x);
    }
}


// Продемонстрировать срок действия переменной
class LifeTime {
    public static void main(String args[]) {
        int x;
        for (x = 0; x < 3; x++) {
            int y = -1; // переменная y инициализируется при
// каждом вхождении в блок кода
            System.out.println(" y равно : " + y); // здесь всегда
// выводится значение -1

            y = 100;
            System.out.println(" y теперь равно : " + y);
        }
    }
}


//Скомпилировать эту программу нельзя
class ScopeErr{
    public static void main(String[] args) {
        int bar = 1;
        {                 // создается новая область действия
            //int bar = 2;  // Ошибка во время компиляции - переменная bar уже определена!
        }
    }
}


// Продемонстрировать приведение типов
class Conversion {
    public static void main(String args[]) {
        byte b;
        int i = 257;
        double d = 323.142;
        System.out.println("\n Пpeoбpaзoвaниe типа int в тип byte.");
        b = (byte) i;
        System.out.println(" i и b" + i + " " + b);
        System.out.println("\nПpeoбpaзoвaниe типа douЫe в тип int.");
        i = (int) d;
        System.out.println("d и i" + d + " " + i);
        System.out.println("\nПpeoбpaзoвaниe типа douЫe в тип byte.");
        b = (byte) d;
        System.out.println("d и Ь" + d + " " + b);
    }
}


class Promote {
    public static void main (String args[]) {
        byte b = 42;
        char c = 'а';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        double result = (f * b) + (i / c) - (d * s);
        System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
        System.out.println("result = " + result);
    }
}


// Продемонстрировать применение одномерного массива
class Array {
    public static void main(String args[]) {
    int month_days[] ;
    month_days = new int[12] ;
    month_days [0] = 31;
    month_days [1] = 28;
    month_days [2] = 31;
    month_days [3] = 30;
    month_days [4] = 31;
    month_days [5] = 30;
    month_days [6] = 31;
    month_days [7] = 31;
    month_days [8] = 30;
    month_days [9] = 31;
    month_days [10] = 30;
    month_days [11] = 31;
System. out.println ("B апреле " + month_days[3] + " дней.");
    }
}

// Усовершенствованная версия предыдущей программы
class AutoArray {
    public static void main(String args[]) {

        int month_days [] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, -
                30, 31 };
        System.out.println("B апреле " + month_days[3] + " дней.");
    }
}

// Вычисление среднего из массива значений
class Average {
    public static void main(String args[]) {
        double nums[] = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;
        int i;
        for (i=0; i< 5; i++)
            result = result + nums[i];
        System.out.println("Cpeднee значение равно " + result / 5 );
    }
}

// Продемонстрировать применение двухмерного массива
class TwoDArray {
    public static void main(String args[]) {
        int twoD[][] = new int[4][5];
        int i, j, k = 0;

        for (i = 0; i < 4; i++)
            for (j = 0; j < 5; j++) {
                twoD[i][j] = k;
                k++;
            }
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++)
                System.out.print(twoD[i][j] + " ");
            System.out.println();
        }
    }
}

// Резервирование памяти вручную для массива с разной
// размерностью второго измерения
class TwoDAgain {
    public static void main(String args[]) {
        int twoD[][] = new int[4][];
        twoD[0] = new int[1];
        twoD[1] = new int[2];
        twoD[2] = new int[3];
        twoD[3] = new int[4];
        int i, j, k = 0;

        for (i = 0; i < 4; i++) {
            for (j = 0; j < i + 1; j++) {
                twoD[i][j] = k;
                k++;
            }
            System.out.println(twoD[i][j] + " ");
            System.out.println();
        }
    }
}

// Инициализировать двухмерный массив
class Matrix {
    public static void main (String args[]) {
        double m[] [] = {
                { 0*0, 1*0, 2*0, 3*0 },
                { 0*1, 1*1, 2*1, 3*1 },
                { 0*2, 1*2, 2*2, 3*2 },
                { 0*3, 1*3, 2*3, 3*3 }
        };
        int i, j;
        for(i=0; i<4; i++) {
            for(j=0; j<4; j++)
                System.out.print(m[i][j] + " " );
            System.out.println();
        }
    }
}

// Продемонстрировать применение трехмерного массива
class ThreeDMatrix {
    public static void main (String args[]) {
        int threeD[][][] = new int [3][4][5];
    int i, j, k;
for (i=0; i<3; i++)
            for (j=0; j<4; j++)
            for (k=0; k<5; k++)
    threeD [i] [j] [k] = i * j * k;
for (i=0; i<3; i++) {
        for (j=0; j<4; j++) {
            for (k=0; k<5; k++)
                System.out.print (threeD[i][j][k] + " " );
            System.out.println();
        }
        System.out.println();
        }
    }
}