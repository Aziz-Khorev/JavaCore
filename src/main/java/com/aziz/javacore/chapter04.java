package com.aziz.javacore;
public class chapter04 {}
    // Продемонстрировать основные арифметические операции
    class BasicMath {
        public static void main(String args[]) {
// арифметические операции над целочисленными значениями
            System.out.println("Цeлoчиcлeннaя арифметика");
            int a = 1 + 1;
            int b = a * 3;
            int c = b / 4;
            int d = c - a;
            int e = -d;
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
            System.out.println("d = " + d);
            System.out.println("e = " + e);

// арифметические операции над значениями типа double
            System.out.println("\nApифмeтикa с плавающей точкой");
            double da = 1 + 1;
            double db = da * 3;
            double dc = db / 4;
            double dd = dc - a;
            double de = -dd;
            System.out.println("da = " + da);
            System.out.println("db = " + db);
            System.out.println("dc = " + dc);
            System.out.println("dd = " + dd);
            System.out.println("de = " + de);
        }
    }



// Продемонстрировать применение операции %
class Modulus {
    public static void main(String args[]) {
        int x = 42;
        double y = 42.25;

        System.out.println("x mod 10 = " + x % 10);
        System.out.println("y mod 10 = " + y % 10);
    }
}


// Продемонстрировать применени нескольких операций с присваиванием
class OpEquals {
    public static void main(String args[]) {
        int a = 1;
        int b = 2;
        int c = 3;
        a += 5;
        b *= 4;
        c += a * b;
        c %= 6;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}


// Продемонстрировать применение операции инкремента ++
class IncDec {
    public static void main(String args[]) {
        int a = 1;
        int b = 2;
        int c;
        int d;
        c = ++b;
        d = a++;
        c++;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}


class BitLogic {
    // Продемонстрировать применение поразрядных логических операций
    public static void main(String args[]) {
        String binary[] = {
                "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
        };
        int a = 3; // 0 + 2 + 1, или 0011 в двоичном представлении
        int b = 6; // 4 + 2 + 0, или 0110 в двоичном представлении
        int c = a | b;
        int d = a & b;
        int e = a ^ b;
        int f = (~a & b) | (a & ~b);
        int g = ~a & 0x0f;
        System.out.println(" а = " + binary[a]);
        System.out.println(" Ь = " + binary[b]);
        System.out.println(" a|b = " + binary[c]);
        System.out.println(" а&Ь = " + binary[d]);
        System.out.println(" а^ь = " + binary[e]);
        System.out.println(" ~a&b|a&~b = " + binary[f]);
        System.out.println(" ~а = " + binary[g]);
    }
}

// Сдвиг влево значения типа Ьуtе
class ByteShift {
    public static void main(String args[]) {
        byte a = 64, b;
        int i;

        i = a << 2;
        b = (byte) (a << 2);

        System.out.println("Пepвoнaчaльнoe значение а: " + a);
        System.out.println("i and Ь: " + i + " " + b);
    }
}


// Применение сдвига влево в качестве быстрого способа умножения на 2
class MultByTwo {
    public static void main(String args[]) {
        int i;
        int num = 0xFFFFFFE;
        for(i=0; i<4; i++) {
            num = num << 1;
            System.out.println(num);
        }
    }
}


// Маскирование двоичных разрядов расширения знака
class HexByte {
    static public void main(String args[]) {
        char hex [] = {
                '0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'а', 'Ь', 'с', 'd', 'е', 'f'
        };
        byte b = (byte) 0xf1;
        System.out.println("b = Ох" + hex[(b >> 4) & 0x0f]
                + hex[b & 0x0f]);
    }
}


// Беззнаковый сдвиг двоичных разрядов значения типа Ьуtе
class ByteUShift {
    static public void main(String args[]) {
        char hex[] = {
                '0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'а', 'Ь', 'с', 'd', 'е', 'f'
        };
        byte b = (byte) 0xf1;
        byte c = (byte) (b >> 4 );
        byte d = (byte) (b >>> 4 );
        byte e = (byte) ((b & 0xff) >> 4 );

        System.out.println(" Ь = Ох"
                + hex[(b >> 4) & 0x0f] + hex[b & 0x0f]);
        System.out.println("Ь >>> 4 = Ох"
                + hex[(c >> 4) & 0x0f] + hex[c & 0x0f]);
        System.out.println(" Ь >>> 4 = Ох"
                + hex [(d >> 4 ) & 0x0f] + hex[d & 0x0f]);
        System.out.println("(b & Oxff) >> 4 = Ох"
                + hex [(e >> 4 ) & 0x0f] + hex [e & 0x0f]);
    }
}


class OpBitEquals {
    public static void main (String args[]) {
        int a = 1;
        int b = 2;
        int c = 3;
        a |= 4;
        b >>= 1;
        c <<= 1;
        a ^= c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}


// Продемонстрировать применение логических операций
class BoolLogic {
    public static void main(String args[]) {
        boolean a = true;
        boolean b = false;
        boolean c = a | b;
        boolean d = a & b;
        boolean e = a ^ b;
        boolean f = (!a & b) | (a & !b);
        boolean g = !a;

        System.out.println("        а = " + a);
        System.out.println("        b = " + b);
        System.out.println("      alb = " + c);
        System.out.println("      а&Ь = " + d);
        System.out.println("      а^b = " + e);
        System.out.println("!a&b|a&!b = " + f);
        System.out.println("       !а = " + g);
    }
}


// Продемонстрировать применение тернарной операции ?
class Ternary {
    public static void main(String args[]) {
        int i, k;

        i = 10;
        k = i < 0 ? -i : i; // получить абсолютное значения переменной i
        System.out.print("Aбcoлютнoe значение ");
        System.out.println(i +" равно " + k);
        i = -10;
        k = i < 0 ? -i : i; // получить абсолютное значения переменной i
        System.out.print("Aбcoлютнoe значение ");

        System.out.print("Абсолютное значение ");
        System.out.println(i + " равно " + k);
    }
}