package Aziz;
public class chapter02 {
    /*
Это простая программа на Java.
Присвоить исходному файлу имя "Example.Java"
*/
    class Example {
        // Эта программа начинается с вызова метода main ()
        public static void main (String args[] ) {
            System.out.println(" Пpocтaя программа на Java.");
        }
    }
}

/*
Это еще один короткий пример программы.
Присвоить исходному файлу имя "Exaiaple2.java"
*/
class Example2 {
    public static void main (String args[]) {
        int num; // в этой строке кода объявляется переменная с именем num

        num = 100; // в этой строке кода переменной num
        //присваивается значение 100

        System.out.println("Этo переменная num: " + num);

        num = num * 2;

        System.out.print("Знaчeниe переменной num * 2 равно ");
        System.out.println(num);
    }
}


/*
Продемонстрировать применение условного оператора if .
Присвоить исходному файлу имя " IfSaiaple . java"
*/
class IfSample {
public static void main(String args[]) {
int x, у;

x = 10;
у = 20;

if(x < у) System.out.println("x меньше у");

x = x * 2;
if(x == у) System.out . println ("x теперь равно у" );

x = x * 2;
if(x > у) System.out.println("x теперь больше у" ) ;

// этот оператор не будет ничего выводить
if(x == у) System.out.println("вы не увидите этого");
  }
}

/*
        Продемонстрировать применение цикла for.
        Присвоить исходному файлу имя "ForTest.java"
        */
class ForTest {
    public static void main (String args[]) {
        int x;

        for(x = 0; x<10; x = x+1)
            System.out.println("Знaчeниe х: " + x);
    }
}

/*
Продемонстрировать применение блока кода .
Присвоить исходному файлу имя "BlockTest.java"
*/
class BlockTest {
    public static void main (String args[]) {
        int x, y;

        y = 20;

// адресатом этого оператора цикла служит блок кода
        for (x = 0; x<10; x++) {
            System.out.println ("Знaчeниe х: " + x);
            System.out.println ("Знaчeниe у: " + y);
            y = y - 2;
        }
    }
}
