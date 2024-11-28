package lesson_03;

import java.util.Scanner;

public class Converter {

    public static final double K1 = 1.8;
    public static final double K2 = 32.0;
    public static final int K3 = 1024;

    public static int convertMbInGg(int m) {
        return m * K3;
    }

    public static double indexBodyWeight(double weight, double height) {
        return (weight / (height * height)) * 10_000;
    }

    public static double convertTempFromCelsiusInFahrenheit(double temp) {
        return temp * K1 + K2;
    }

    public static void convertMoney() {
        System.out.println("Конвертер валют");
        System.out.println("Введите количество рублей");
        double rubCount = new Scanner(System.in).nextDouble();

        System.out.println("Введите текущий курс евро");
        double eurCourse = new Scanner((System.in)).nextDouble();

        System.out.println("Введите текущий курс доллара");
        double dollarCourse = new Scanner(System.in).nextDouble();

        System.out.println(rubCount + " рублей это " + rubCount / eurCourse + " евро");
        System.out.println(rubCount + " рублей это " + rubCount / dollarCourse + " долларов");
    }
}
