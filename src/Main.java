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
    }
}