package com.aziz.javacore.chapter09;
/*
package p1

public class Protection {
    int n = 1;
    private int n_pri = 2;
    protected int n_pro = 3;
    public int n_pub = 4;

    public Protection() {
        System.out.println("констурктор базового класса");
        System.out.println("n = " + n);
        System.out.println("n_pri " + n_pri);
        System.out.println("n_pro " + n_pro);
        System.out.println("n_pub " + n_pub;
    }
}

package p1;

class Derived extends Protection {
    Derived() {
        System.out.println("коснутрктор подакласса");
        System.out.println("n = " + n);

        // доступно только для класса
        //System.out.println("n_pri = 4 " + n_pri);
    }
}

 package p1;
class SamePackage {
    SamePackage() {

        Protection p = new Protection();
        System.out.println("констурктор из того же самого пакета ");
        System.out.println("n = " + p.n);

        // доступно только для класса
        //System.out.println("n_pri" + p.n_pri);

        System.out.println("n_pro" + p.n_pro);
        System.out.println("n_pub " + p.n_pub);
    }
}


package p2;

class Protection2 extends p1.Protection{
    Protection2() {
        System.out.println("констурктор, унаследованный из другого пакета");
        // доступ только для данного класса или пакета
        System.out.println("n = " + n);

        // доступ только для данного класса
        System.out.println("n_pri " + n_pri);
    }
}

package p2;

class OtherPackage {
    OtherPackage() {
        p1.Protection p = new p1.Protection();
        System.out.println("конструктор из другого пакета");

        // доступно только для данного класса или пакета
        // System.out.println("n = " + p.n);

        // доступ только для данного класса
        // System.out.println("n_pri = " + p.n_pri);

        // доступно только для данного класса,
        // подкласса или пакета
        // System.out.println("n_pro = " + p.n_pro);

        System.out.println("n_pub = " + p.n_pub);
    }
}

// Демонстрационный пакет p1
package p1;

// получить экземпляры различных классов из пакета p1
public class Demo {
    public static void main(String[] args) {
        Protection ob1 = new Protection();
        Derived ob2 = new Derived();
        SamePackage ob3 = new SamePackage();
    }
}

// Демонстрационный пакет p2
package p2;

//получить экземпляры различных классов из пакета p2
public class Demo {
    public static void main(String[] args) {
        Protection2 ob1 = new Protection2();
        Derived ob2 = new Derived();
    }
}
*/