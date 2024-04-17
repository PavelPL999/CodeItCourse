package lesson_13;

public enum DeliverTypes {

    STEP("Пешая доставка стоит 100 руб."),
    AUTO("Автомобильная доставка стоит 200 руб."),
    AERO("Авиадоставка стоит 1000 руб."),

    WATER("Водная доставка стоит 500 руб.");

    private String value;

    DeliverTypes(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
