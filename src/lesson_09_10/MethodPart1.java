package lesson_09_10;

import java.util.Scanner;

public class MethodPart1 {

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int inputNum() {
        System.out.println("Введите число");
        return new Scanner(System.in).nextInt();
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        printArray(numbers);
        numbers[1] = inputNum();
        numbers[2] = inputNum();;
        printArray(numbers);
    }
}
