package lesson_06;

import java.util.Scanner;

public class Homework_6_Task_2 {

    public static void main(String[] args) {
        System.out.println("\t\t\t***Программа определения весов товаров***\n");

        System.out.println("Введите первый вес: ");
        double first = new Scanner(System.in).nextDouble();

        System.out.println("Введите второй вес: ");
        double second = new Scanner(System.in).nextDouble();

        System.out.println("Введите третий вес: ");
        double third = new Scanner(System.in).nextDouble();

        double greatest = 0;
        double average = 0;
        double smallest = 0;
        //todo дописать логику программы ниже.
//        if (first > second && first > third) {
//            greatest = first;
//        } else if (first < second && first < third) {
//            smallest = first;
//        } else {
//            average = first;
//        }
//        if (second > first && second > third) {
//            greatest = second;
//        } else if (second < first && second < third) {
//            smallest = second;
//        } else {
//            average = second;
//        }
//        if (third > first && third > second) {
//            greatest = third;
//        } else if (third < first && third < second) {
//            smallest = third;
//        } else {
//            average = third;
//        }
        //greatest = first > second && first > third ? first : second > third ? second : third;
        //smallest = first < second && first < third ? first : second < third ? second : third;
        greatest = first > second && first > third ? first : Math.max(second, third);
        smallest = first < second && first < third ? first : Math.min(second, third);
        if ((first > second && first < third) || (first < second && first > third)) {
            average = first;
        } else if ((second > first && second < third) || (second < first && second > third)) {
            average = second;
        } else {
            average = third;
        }
        //todo
        System.out.println("Наибольший вес: " + greatest);
        System.out.println("Средний вес: " + average);
        System.out.println("Наименьший вес: " + smallest);
    }
}
