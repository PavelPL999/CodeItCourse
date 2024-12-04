package lesson_06;

import java.util.Scanner;

public class VendApparate {

    public static void main(String[] args) {
        int twixPrice = 77;
        int marsPrice = 78;
        int snickersPrice = 100;
        int bonAquaPrice = 50;
        boolean isCanBye = false; //переменная-флаг

        System.out.println("Введите кол-во денег");
        int moneyAmount = new Scanner(System.in).nextInt();
        if (moneyAmount >= twixPrice) {
            System.out.println("Вы можете купить twix");
            isCanBye = true;
        }
        if (moneyAmount >= marsPrice) {
            System.out.println("Вы можете купить mars");
            isCanBye = true;
        }
        if (moneyAmount >= snickersPrice) {
            System.out.println("Вы можете купить snickers");
            isCanBye = true;
        }
        if (moneyAmount >= bonAquaPrice) {
            System.out.println("Вы можете купить bonAqua");
            isCanBye = true;
        }
        if (moneyAmount >= 50 && moneyAmount % 10 == 0) {
            System.out.println("Вы выиграли счастливый билет");
        }
        if (!isCanBye) {
            System.out.println("Недостаточно денег");
        }
    }
}
