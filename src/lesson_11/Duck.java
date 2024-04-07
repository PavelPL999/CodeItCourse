package lesson_11;

public class Duck {

    String name;
    int age;
    String color;

    public static int footCount;

    public Duck(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void fly() {
        System.out.println(color + " duck " + name + " is flying to South " + footCount);
    }
    public static void fly(int footCount) {
        Duck.footCount = footCount;
    }
}
