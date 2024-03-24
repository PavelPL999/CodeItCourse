package lesson_03;

/*
    Написать программу, которая конвертирует мегабайты в гигабайты
    Написать программу, к/я рассчитывает индекс массы тела (масса кг / (рост, cм * рост, cм))
    18.5 - 24.9 - нормальный вес тела
    25 - 30 избыточная масса
 */

import java.util.Scanner;

public class Converter {

    public static int convertMbInGg(int m) {
        return m * 1024;
    }

    public static double indexBodyWeight(double weight, double height) {
        return (weight / (height * height)) * 10_000;
    }

    public static double convertTempFromCelsiusInFahrenheit(double tempC) {
        return tempC * 1.8 + 32;
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
