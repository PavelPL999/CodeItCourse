package lesson_12;

public class RobotTest {

    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.setX(5);
        robot.setY(5);

        robot.setX(-30);

        robot.move(0, 10);
        System.out.println("Текущие координаты Х и Y: " + robot.getX() + " " + robot.getY());

        System.out.println("Второе перемещение");
        robot.move(10, 15);
        System.out.println("Текущие координаты Х и Y: " + robot.getX() + " " + robot.getY());

    }
}
