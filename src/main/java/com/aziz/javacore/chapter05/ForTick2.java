package com.aziz.javacore.chapter05;

// Объявить переменную управления циклом в самом цикле for
class ForTick2 {
    public static void main(String args[]) {
// здесь переменная n объявляется в самом цикле for
        for (int n = 10; n > 0; n--)
            System.out.println("такт " + n);
    }
}