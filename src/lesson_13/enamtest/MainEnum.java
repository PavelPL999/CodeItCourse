package lesson_13.enamtest;

public class MainEnum {

    public static void main(String[] args) {
        Subscription subscription = new Subscription();
        System.out.println(Subscription.State.valueOf("NONE"));
        System.out.println(Subscription.State.ACTIVE.toString());
        System.out.println(Subscription.State.SUSPENDED.ordinal());
        System.out.println(Subscription.State.values()[2]);

        switch (subscription.state) {
            case NONE:
                break;
            case ACTIVE:
                break;
            case SUSPENDED:
                break;
            default:
                System.out.println("Error");
        }
    }
}

class Subscription {

    String name;
    String description;
    State state;

    enum State {
        NONE, ACTIVE, SUSPENDED;
    }
}
