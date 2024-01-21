public class Main {
    public static void main(String[] args) {
        //task1
        System.out.println("task1");
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.print(i + " ");
        }
        System.out.println("\ntask2");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\ntask3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println("\ntask4");
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\ntask5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            if (i % 4 == 0) {
                System.out.println(i + " год является високосным");
            }
        }
        System.out.println("task6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(i + " ");
        }
        System.out.println("\ntask7");
        for (int i = 1; i <= 9; i++) {
            System.out.print(Math.round(Math.pow(2, i)) + " ");
        }
        System.out.println("\ntask8");
        int summa = 0;
        for (int i = 1; i <= 12; i++) {
            summa = summa + 29000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + summa);
        }
        System.out.println("task9");
        double summa1 = 29000;
        for (int i = 1; i <= 12; i++) {
            summa1 = summa1*1.01;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + summa1);
        }
        System.out.println("task10");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + 2*i);
        }
    }
}