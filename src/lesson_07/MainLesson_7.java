package lesson_07;

import java.util.Scanner;

public class MainLesson_7 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i < 3 || i > 6) {
                continue;
            }
            System.out.println(i);
        }

        boolean isContinue = true;
        while(isContinue) {
            System.out.println("Hello! Enter, if you want to continue - 0, if NO - 1");
            int input = new Scanner(System.in).nextInt();
            if (input == 1) {
                isContinue = false;
            }
        }

//       do {
//            System.out.println("Hello! Enter, if you want to continue - 0, if NO - 1");
//            int input = new Scanner(System.in).nextInt();
//            if (input == 1) {
//                isContinue = false;
//            }
//        } while (isContinue);
    }
}
