package com.aziz.javacore.chapter03;

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
