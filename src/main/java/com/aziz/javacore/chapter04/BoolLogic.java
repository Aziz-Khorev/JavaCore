package com.aziz.javacore.chapter04;

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
