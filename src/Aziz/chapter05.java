package Aziz;
public class chapter05 {
    // Продемонстрировать применение конструкции if-else-if
   class IfElse {
        public static void main(String[] args) {
            int month = 4; // Апрель
            String season;
            if(month == 12 || month == 1 || month == 2)
                season = "зиме";
            else if (month == 3 || month == 4 || month == 5)
                season = "весна";
            else if (month == 6 || month == 7 || month == 8)
                season = "лето";
            else if(month == 9 || month == 10 || month == 11)
                season = "осень";
            else
                season = "вымышленныый месяц";
            System.out.println("Апрель относится к " + ".");
        }
    }


// Простой пример применения оператора switch
class SampleSwitch {
    public static void main(String args[]) {
        for(int i=0; i<6; i++)
            switch(i) {
        case 0:
        System.out.println("i равно нулю.");
        break;
        case 1:
        System.out.println(" i равно единице.");
        break;
        case 2:
        System.out.println("i равно двум.");
        break;
        case 3:
        System.out.println("i равно трем.");
        break;
        default:
        System.out.println("i больше трех.");
    }
}
}


// В операторе switch необязательно указывать операторы break
class MissingBreak {
        public static void main( String args []) {
        for(int i = 0; i<12; i++)
            switch(i) {
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
            System.out.println("i меньше 5");
            break;
        case 5:
        case 6:
        case 7:
        case 8:
        case 9:
            System.out.println("i меньше 10");
            break;
        default:
            System.out.println("i равно или больше 10");
    }
}
}


// Усовершенствованная версия программы, в которой
// определяется принадлежность месяца времени года
class Switch {
    public static void main(String args[]) {
        int month = 4;
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "зиме";
                break;
            case 3:
            case 4:
            case 5:
                season = "весне";
                break;
            case 6:
            case 7:
            case 8:
                season = "лету";
                break;
            case 9:
            case 10:
            case 11:
                season = "осени";
                break;
            default:
                season = "вымышленным месяцам";
        }
                System.out.println("Aпpeль относится к" + season + ".");
    }
}


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


// Продемонстрировать применение оператора цикла while
class While {
    public static void main(String args[]) {
        int n = 10;
        while (n > 0) {
            System.out.println("тaкт " + n);
            n--;
        }
    }
}


// Целевая часть цикла может быть пустой
class NoBody {
    public static void main(String args[]) {
        int i, j;
        i = 100;
        j  =200;
        // рассчитать среднее значение переменных i и j
        while (++i < --j) ; // у этого цикла отсутствует тело
        System.out.println("Cpeднee значение равно " + i);
    }
}


// Продемонстрировать применение оператора цикла do-while
        class DoWhile {
    public static void main(String args[]) {
        int n = 10;
        do {
            System.out.println(" тaкт " + n);
            n--;
        } while (n > 0);
    }
}


// Использовать оператор цикла do-while для выбора пункта меню
class Menu {
    public static void main(String args[]) {
            throws java.io.IOException {
            char choice;
            do {
                System.out.println(" Cпpaвкa по оператору : ");
                System.out.println(" 1. if ");
                System.out.println(" 2. switch");
                System.out.println(" З. while");
                System.out.println(" 4. do-while ");
                System.out.println(" 5. for\n");
                System.out.println(" Bыбepитe нужный пункт:");
                choice = (char) System.in.read();
            } while (choice < '1' || choice > '5');
            System.out.println("\n");
            switch (choice) {
                case '1':
                    System.out.println("if:\n ");
                    System.out.println("if ( ycлoвиe) оператор;");
                    System.out.println("else оператор; ");
                    break;
                case '2':
                    System.out.println("switch:\n");
                    System.out.println("switch ( выpaжeниe ) {");
                    System.out.println("сазе константа : ");
                    System.out.println("последовательность операторов ");
                    System.out.println("break; ");
                    System.out.println(" // ... ");
                    System.out.println("}");
                    break;
                case '3':
                    System.out.println("while:\n");
                    System.out.println("while(ycлoвиe) оператор;");
                    break;
                case '4':
                    System.out.println(" do-while:\n");
                    System.out.println("do {");
                    System.out.println(" оператор;");
                    System.out.println("} while (условие);");
                    break;
                case '5':
                    System.out.println("for : \n");
                    System.out.print("for(инициaлиэaция; условие ; итерация)");
                    System.out.println(" оператор;");
                    break;
            }
        }
    }


    // Продемонстрировать применение оператора цикла for
    class ForTick {
        public static void main(String args[]) {
            int n;
            for (n = 10; n > 0; n--)
                System.out.println("тaкт " + n);
        }
    }


    // Объявить переменную управления циклом в самом цикле for
    class ForTick {
        public static void main(String args[]) {
// здесь переменная n объявляется в самом цикле for
            for (int n = 10; n > 0; n--)
                System.out.println("тaкт " + n);
        }
    }


    // Проверить на простые числа
    class FindPrime {
        public static void main(String args[]) {
            int num;
            boolean isPrime;
            num = 14;
            if (num < 2) isPrime = false;
            else isPrime = true;
            for (int i = 2; i <= num / i; i++) {
                if ((num % i) == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.println(" Пpocтoe число");
            else System.out.println("He простое число");

        }
    }


    class Sample {
        public static void main(String args[]) {
            int a, b;
            b = 4;
            for (a = 1; a < b; a++)
                System.out.println("a = " + a);
            System.out.println("b = " + b);
            b--;
        }
    }
}


// Исполь зование запятой в операторе цикла for
class Comma {
    public static void main(String args[]) {
        int a, b;
        for (a = 1, b = 4; a < b; a++, b--) {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }
}


// Отдельные части оператора цикла for могут отсутствовать
class ForVar {
    public static void main(String args[]) {
        int i;
        boolean done = false;
        i = 0;
        for (; !done; ) {
            System.out.println("i равно" + i);
            if (i == 10) done = true;
            i++;
        }
    }
}


// Применение цикла for в с тиле for each
class ForEach {
    public static void main {String args []){
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        // исполь зовать цил в стиле for each для вывода и
        // суммирования значений
        for (int x : nums) {
            System.out.println(" Знaчeниe равно : " + x);
            sum += x;
        }
        System.out.println("Cyммa равна : " + sum);
    }
}


// Применение оператора break в цикле for в стиле for each
    class ForEach2 {
        public static void main (String args[] ) {
            int sum = 0;
            int nurns [] = { 1, 2, 3, 4 , 5, 6, 7, 8, 9, 10 ) ;
            // использовать цикл for в стиле for each для
            // вывода и суммирования значений из части массива
            for(int x : nurns) {
                System.out.println("Знaчeниe равно: " + x);
                sum += x;
                if (x == 5) break; // прервать цикл после
                // получения 5 значений
            }
                System.out.println( "Cyммa пяти первых элементов равна : "+ sum);
            }
        }


        // Переменная цикла в стиле for each доступна толь ко для ч тения
    class NoChange {
            public static void main(String args[]) {
                int nurns[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                for (int x : nurns) {
                    System.out.print(x + " ");
                    x = x * 10; // этот оператор не оказывает никакого
                    // влияния на массив nums
                }
                System.out.println();
                for (int x : nurns)
                    System.out.print(x + " ");
                System.out.println();
            }
        }


        // Применение цикла for в стиле for each для
        // обращения к двухмерному массиву
    class ForEach3 {
            public static void main(String args[]) {
                int sum = 0;
                int nums[][] = new int[3][5];
                // присвоить значение элементам массива nums
                for (int i = 0; i < 3; i++)
                    for (int j = 0; j < 5; j++)
                        nums[i][j] = (i + 1) * (j + 1);
                // исполь зовать цикл for в стиле for each для
                // вывода и суммирования значение
                for (int x[] : nums) {
                    for (int y : x) {
                        System.out.println("Знaчeниe равно: " + y);
                        sum += y;
                    }
                }
                System.out.println("Cyммa: " + sum);
            }
        }



        // Поиск в массиве с применением цикла for в стиле for each
    class Search {
        public static void main(String args[]) {
            int nums [] = { 6, 8, 3, 7, 5, 6, 1, 4 };
            int val = 5;
            boolean found = false;
            // исполь зовать цикл for в стиле for each для
            // поиска значения переменной val в массиве nums
            for (int x : nums ) {
                if(x == val) {
                    found = true;
                    break;
                }
            }
                    if(found )
                            System.out.println("Знaчeниe найдено!");
        }
        }


        // Циклы могут быть вложенными
    class Nested {
            public static void main(String args[]) {
                int i, j;
                for (i = 0; i < 10; i++) {
                    for (j = i; j < 10; j++)
                        System.out.print(".");
                    System.out.println();
                }
            }
        }


        // Применение оператора break для выхода из цикла
    class BreakLoop {
            public static void main(String args[]) {
                for (int i = 0; i < 100; i++) {
                    if (i == 10) break; // выход из цикла, если значение
                                        // переменной i равно 10
                    System.out.println("i: " + i);
                }
                System.out.println(" Цикл завершен.");
            }
        }



        // Применение оператора break для выхода из цикла while
    class BreakLoop2 {
            public static void main(String args[]) {
                int i = 0;
                while (i < 100) {
                }
                if (i == 10) break; //выход из цикла, если значение
                // переменной i равно 10
                System.out.println("i: " + i);
                i++;
            }
            System.out.println("Цикл завершен.");
        }
}


    // Применение оператора break во вложенных циклах
    class BreakLoopЗ {
        public static void main(String args[]) {
            for (int i = 0; i < 3; i++) {
                System.out.print(" Пpoxoд " + i + " : ");
                for (int j = 0; j < 100; j++) {
                    if (j == 10) break; // выход из цикла , значение
                    // переменной j равно 10
                    System.out.print(j + " ");
                }
                System.out.println();
            }
            System.out.println(" Циклы завершены . ");
        }
    }


    // Применение оператора break в качестве цивилизованной
    // формы оператора qoto
    class Break {
        public static void main(String args[]) {
            boolean t = true;
            first: {
                second: {
                    third: {
                        System.out.println("Пpeдшecтвyeт оператору break . ");
                        if (t) break second; // выход из блока second
                        System.out.println("Этoт оператор не будет выполняться");
                    }
                    System.out.println("Этoт оператор не будет выполняться");
                }
                System.out.println("Этoт оператор следует за блоком second.");
            }
        }
    }



    // Применение оператора break для выхода из вложенных циклов
    class BreakLoop4 {
        public static void main(String args[]) {
            outer:
            for (int i = 0; i < 3; i++) {
                System.out.print("Пpoxoд " + i + ": ");
                for (int j = 0; j < 100; j++) {
                    if (j == 10) break outer; // выход из обоих циклов
                    System.out.print(j + " ");
                }
                System.out.println(" Этa строка не буде т выводиться ");
            }
            System.out.println(" Циклы завершены . ");
        }
    }


    // Эта программа содержит ошибку
    class BreakErr {
        public static void main(String args[]) {
            one:
            for (int i = 0; i < 3; i++) {
                System.out.print(" Пpoxoд " + i + "· ");
            }
            for (int j = 0; j < 100; j++) {
                if (j == 10) break one; // ОШИБКА !
                System.out.println(j + " ");
            }
        }
    }


// Продемонстрировать применение оператора continue
    class Continue {
    public static void main(String args[]) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if (i % 2 == 0) continue;
            System.out.println("");
        }
    }
}


// Применение оператора continue с меткой
    class ContinueLabel {
    public static void main(String args[]) {
        outer:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j > i) {
                    System.out.println();
                    continue outer;
                }
                System.out.print(" " + (i * j));
            }
        }
        System.out.println();
    }
}


    // Продемонстрировать применение оператора return
    class Return {
        public static void main(String args[]) {
            boolean t = true;
            System.out.println("Дo возврата.");
            if (t) return; // возврат в вызывающий код
            System.out.println(" Этoт оператор выполняться не будет.");
        }
    }







