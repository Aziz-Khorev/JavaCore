package com.aziz.javacore.chapter05;

// Использовать символьные строки для управления оператором svitch
class StringSwitch {
    public static void main(String args[]) {
        String str = "два";
        switch (str) {
            case "один":
                System.out.println("oдин");
                break;
            case "два":
                System.out.println("двa");
                break;
            case "три":
                System.out.println("тpи");
                break;
            default:
                System.out.println(" нe совпало )");
                break;
        }
    }
}
