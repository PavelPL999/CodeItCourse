package lesson_11;

public class Phone {

    public static String country = "China";
    int phoneNumber;
    String phoneModel;
    int phoneWeight;

    public Phone() {
    }

    public Phone(int phoneNumber, String phoneModel, int phoneWeight) {
        this.phoneNumber = phoneNumber;
        this.phoneModel = phoneModel;
        this.phoneWeight = phoneWeight;
    }

    public static void receiveCall(String name) {
        receiveCall(name, 0);
    }

    public static void receiveCall(String name, int number) {
        System.out.println("Звонит абонент по имени " + name + ", номер " + (number == 0 ? "не определен" : number));
    }
}

class PhoneTest {

    public static void main(String[] args) {
        Phone nokia = new Phone();
        nokia.phoneNumber = 454687;
        Phone xiaomi = new Phone(123456, "Xiaomi Mi-20", 225);
        Phone.receiveCall("Ivan");
        Phone.receiveCall("Olya", 987456);
        System.out.println(Phone.country);
    }
}
