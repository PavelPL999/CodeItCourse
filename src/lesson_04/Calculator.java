package lesson_04;

import java.util.Scanner;

public class Calculator {

    public static void calculator() {
        System.out.println("Добро пожаловать в калькулятор умножения целых чисел!");
        System.out.println("\tВведите первое целое число: ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("\tВведите второе целое число: ");
        int b = new Scanner(System.in).nextInt();
        System.out.println(a + " * " + b + " = " + a * b);
    }
}
