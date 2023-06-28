package com.aziz.javacore.chapter04;

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
