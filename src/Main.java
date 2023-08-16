public class Main {
    public static void main(String[] args) {
        System.out.println("Циклы. Урок 2");
        System.out.println("___________________");
        System.out.println("Задача №1");
        int salary = 15000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            total = total + salary;
            month = month + 1;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
        }
        System.out.println("___________________");
        System.out.println("Задача №2");
        int i = 0;
        while (i<10) {
            i = i + 1;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i>=1; i = i - 1) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("___________________");
        System.out.println("Задача №3");
        int population = 12_000_000;
        int birthRate = 17 * population / 1000;
        int mortality = 8 * population / 1000;
        int year = 0;
        while (year < 10) {
            population = population + birthRate - mortality;
            year = year + 1;
            System.out.println("Год " + year + " численность населения составляет " + population);
        }
    }
}