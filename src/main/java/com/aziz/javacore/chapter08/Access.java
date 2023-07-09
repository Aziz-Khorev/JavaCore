/*
package com.aziz.javacore.chapter08;

// В иерархии классов закрытые члены остаются закрытыми в пределах своего класса.
// Эта программа содержит ошибку, и поэтому скомпилировать ее не удастся.

//  создать суперкласс
class A2 {
    int i;          // Этот член открыт по умолчанию
    private int j;  // а этот член закрыт в классе A

    void setig(int x, int y) {
        i = x;
        j = y;
    }
}

// Член j класса A в этом классе недоступен
class B2 exteпds A2 {
    int total;

    void sum() {
        total = i + j; // ОШИБКА: член j в этом классе недоступен
    }
}

public class Access {
    public static void main(String[] args) {
        B subOb = new B();

        subOb.setij(10, 12);

        subOb.sum();
        System.out.println("Сумма равна " + subOb.total);
    }
}
*/