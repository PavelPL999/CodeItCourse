package lesson_09_10;

import java.util.Scanner;

public class MethodPart2 {

    static String booksInfo = "";

    public static String inputBookName() {
        System.out.println("Введите название книги");
        return new Scanner(System.in).nextLine();
    }

    public static int inputPageCount() {
        System.out.println("Введите количество страниц");
        return new Scanner(System.in).nextInt();
    }

    public static void addBook(String bookName) {
        addBook(bookName, 0);
    }

    public static void addBook(String bookName, int pagesCount) {
        booksInfo += bookName + ", " + (pagesCount > 0 ? pagesCount : "n/a") + " стр." + "\n";
    }

    public static void printInfo() {
        System.out.println(booksInfo);
    }

    public static void main(String[] args) {
        while (true) {
            String name = inputBookName();
            int pageCount = inputPageCount();
            addBook(name, pageCount);
            printInfo();
        }
    }
}
