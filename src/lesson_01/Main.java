package lesson_01;

import lesson_03.Converter;
import lesson_04.Calculator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean isContinue = true;
        int x = 0;
        int y = 0;
        while (isContinue) {
            System.out.println("Сдвиньте робота: \n1 - left\n2- right\n3 - up\n4 - down");
            int input = new Scanner(System.in).nextInt();
            if (input == 1) {
                x--;
            } else if (input == 2) {
                x++;
            } else if (input == 3) {
                y++;
            } else if (input == 4) {
                y--;
            } else {
                System.out.println("Error");
                isContinue = false;
            }
            System.out.println("Координата X: " + x + " Координата Y: " + y);
        }
    }
}
