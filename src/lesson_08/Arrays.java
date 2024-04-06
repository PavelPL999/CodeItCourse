package lesson_08;

import java.util.Random;

public class Arrays {

    public static void main(String[] args) {
        int[] people = new int[5];
        double summa = 0;
        for (int i = 0; i < people.length; i++) {
            people[i] = new Random().nextInt(100);
            summa += people[i];
        }
        for (int n : people) {
            System.out.println(n);
        }
        System.out.println("Средний возраст вкладчиков: " + summa / people.length);
    }
}
