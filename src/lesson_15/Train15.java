package lesson_15;

import java.util.Scanner;

public class Train15 {

    public static final String CORRECT_CHARS = " абвгдеёжзиклмнопрстуфхцчшщъыьэюя";

    public static void main(String[] args) {
        String test = "Мама мыла раму";

        // indexOf() - м-д ищет первый индекс элемента, выдаст (-1), если ничего не найдено
        //System.out.println(test.indexOf('р'));

        // lasIndexOf() - ищет последний элемент
        //System.out.println(test.lastIndexOf('м'));

        //substring() - из нашей строки вырезаем подстроки
        //System.out.println(test.substring(5, 9));

        //System.out.println(test.substring(test.indexOf(' ' ) + 1, test.lastIndexOf(' ')));

        //trim() - м-д обрезает все пробелы в начале и в конце строки
        //System.out.println(test.substring(test.indexOf(' ') , test.lastIndexOf(' ')).trim());

//        String input = new Scanner(System.in).nextLine();
//        System.out.println(input.substring(input.indexOf(' ')));

        // валидация - проверка строки на соответствие
        // 1 ввод только русских маленьких букв
        // 2 ввод не более двух слов
        // 3 возвращать второе слово

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
        if (isValid && spaceCount == 1) {
            System.out.println(inputUser.substring(inputUser.indexOf(' ')).trim());
        } else {
            System.out.println("Error");
        }
    }
}
