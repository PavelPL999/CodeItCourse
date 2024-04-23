package lesson_15;

public class DZ15Task1 {

    //todo Напишите код который распечатает букву и ее код для всех букв русского алфавита формат вывода:
    // А-123
    // Б-321...
    // Коды даны для примера и не соответствуют действительности. Учитывайте, что нужно распечатать коды букв в двух регистрах!

    public static final String RU_ALPHABET = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    public static void printRuAlphabet() {
        for (int i = 0; i < RU_ALPHABET.length(); i++) {
            System.out.println(RU_ALPHABET.charAt(i) + "-" +(int) RU_ALPHABET.charAt(i));
        }
    }

    public static void main(String[] args) {
        printRuAlphabet();
    }
}
