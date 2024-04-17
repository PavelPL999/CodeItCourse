package lesson_13.carpack;

public class CarTest {

    public static void main(String[] args) {
        Body body = new Body("Седан");
        Wheels wheels = new Wheels(4);
        Engine engine = new Engine("ДВС-56", 15.6);

        Car car = new Car(engine, body, wheels);
        Car car2 = new Car(new Engine("BMW", 40.0), new Body("Хэтчбэк"), new Wheels(5));
        System.out.println("Объем двигателя " + car.getEngine().getVolume());

        System.out.println(car);
    }
}
