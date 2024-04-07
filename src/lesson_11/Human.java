package lesson_11;

public class Human {
    public String name;
    public String gender;
    public int age;

    public Human() {
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void walk(int stepsCount) {
        System.out.println(name + " прошел " + stepsCount + " шагов");
    }
}
