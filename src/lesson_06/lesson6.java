package lesson_06;
//Урок №6. Условные операторы. Алгоритм ветвления

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class lesson6 {

    // Условные операторы: > < == >= <= !=
    // boolean - логический тип данных true/false
    // логическое И - &&
    // логическое ИЛИ - ||
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        int c = new Scanner(System.in).nextInt();
        if ((a > 5 && b < 5) || c > 100) {
            System.out.println("Hello");
        } else if (a < 5 && (b > 10 || c < 100)) {
            System.out.println("Good bye");
        } else {
            System.out.println("Try again");
        }
        System.out.println("Введите чисто от 0 до 2");
        int number = new Scanner(System.in).nextInt();
        switch (number) {
            case 0 -> System.out.println("0");
            case 1 -> System.out.println("1");
            case 2 -> System.out.println("2");
            default -> System.out.println("Error");
        }
    }
}
