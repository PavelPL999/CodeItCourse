package lesson_14;

import java.util.Scanner;
public class Train14 {

    public static void main(String[] args) {
        String s1 = "123";
        Integer i = 123;

        // из строки s1 делаем число result, use method parseInt()
        Integer result = Integer.parseInt(s1);
        System.out.println(result + i);

        // из числа i делаем строку str, use method valueOf()
        String str = String.valueOf(i);
        System.out.println(str + s1);

        String input = new Scanner(System.in).nextLine(); // вводим числовую строку
        int lastNum = Integer.parseInt(String.valueOf(input.charAt(input.length() - 1)));
        System.out.println(lastNum);
    }
}
