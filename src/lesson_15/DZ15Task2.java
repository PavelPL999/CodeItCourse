package lesson_15;

import java.util.Scanner;

public class DZ15Task2 {
    // на входе через консоль принимает фамилию, имя и отчество одной строкой
    // выводит фамилию, имя и отчество отдельно
    /*
    Валидная строка от пользователя, которую мы можем интерпретировать как Ф. И. О.,
    должна содержать три слова, состоящих из символов кириллицы, разделённых пробелом,
    может содержать дефисы.
    Если строка не соответствует формату, то вывести в консоль: Введенная строка не является ФИО
    */

    public static String CORRECT_CHARS = " -АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя";

    public static void inputData() {
        System.out.println("Введите ФИО");
        String inputUser = new Scanner(System.in).nextLine().trim();

        boolean isValid = true;
        int spaceCount = 0;

        for (int i = 0; i < inputUser.length(); i++) {
            if (inputUser.charAt(i) == ' ') {
                spaceCount++;
            }

            if (!CORRECT_CHARS.contains(String.valueOf(inputUser.charAt(i)))) {
                isValid = false;
                break;
            }
        }

        if (isValid && spaceCount == 2) {
                System.out.println("Фамилия: " + inputUser.substring(0, inputUser.indexOf(" ")).trim());
                System.out.println("Имя: " + inputUser.substring(inputUser.indexOf(" "), inputUser.lastIndexOf(' ')).trim());
                System.out.println("Отчество: " + inputUser.substring(inputUser.lastIndexOf(" ")).trim());
            } else {
                System.out.println("Введенная строка не является ФИО");
            }
    }

    public static void main(String[] args) {
        inputData();
    }
}
