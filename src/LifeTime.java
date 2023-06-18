public class LifeTime {
    public static void main(String args[]) {
        int x;
        for (x = 0; x < 3; x++) {
            int у = -1; // переменная у инициализируется при
// каждом вхождении в блок кода
            System.out.println(" y равно : " + у); // здесь всегда
// выводится значение -1

            у = 100;
            System.out.println(" y теперь равно : " + у);
        }
    }
}