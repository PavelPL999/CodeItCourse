package lesson_14;

import java.util.ArrayList;
import java.util.Scanner;

public class HW14 {

    public static double avg(int num) {
        String numString = String.valueOf(num);
        double sum = 0;
        for (int i = 0; i < numString.length(); i++) {
            sum += Integer.parseInt(String.valueOf(numString.charAt(i)));
        }
        return sum / numString.length();
    }

    public static void main(String[] args) {
        System.out.println("Введите любое целое не отрицательное число: ");
        int input = new Scanner(System.in).nextInt();
        System.out.println(avg(input));
    }
}
