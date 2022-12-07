import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1: ");
        String firstName = "Ivanov ";
        String secondName = "Ivan ";
        String thirdName = "Ivanovich";
        String fullName = firstName + secondName + thirdName;
        System.out.println(fullName);
    }

    public static void task2() {
        System.out.println("Задача 2: ");
        String firstName = "Ivanov ";
        String secondName = "Ivan ";
        String thirdName = "Ivanovich";
        String fullName = firstName + secondName + thirdName;
        System.out.println("Данные ФИО сотрудника для заполнения отсчета - " + fullName.toUpperCase());
    }

    public static void task3() {
        System.out.println("Задача 3: ");
        String firstName = "Иванов ";
        String secondName = "Семён ";
        String thirdName = "Семёнович";
        String fullName1 = firstName + secondName + thirdName;
        String fullName2 = fullName1.replace('ё', 'е');
        System.out.println(fullName2);
    }

    public static void task4() {
        System.out.println("Задача 4: ");
        System.out.println("Введите Ваше имя: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Добро пожаловать, " + name);
    }

    public static void task5() {
        System.out.println("Задача 5: ");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        System.out.println("Температура воздуха сегодня: " + t + " градусов");
    }

    public static void task6() {
        System.out.println("Задача 6: ");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        System.out.println(day + ":" + month + ":" + year);
    }

    public static void task7() {
        System.out.println("Задача 7: ");
        Scanner sc = new Scanner(System.in);
        String fullName = sc.nextLine();
        String helper = sc.nextLine();
        int messages = sc.nextInt();
        System.out.println("Привет, " + fullName + " это твой помошник " + helper + ".\n У тебя " + messages + " новых писем.");
    }
}