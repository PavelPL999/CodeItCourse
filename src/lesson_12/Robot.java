package lesson_12;

public class Robot {

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (x > 0) {
            this.x = x;
        } else {
            System.out.println("Error");
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (y > 0) {
            this.y = y;
        } else {
            System.out.println("Error");
        }
    }

    public void move(int x, int y) {
        this.x = print(this.x, x, "X");
        this.y = print(this.y, y, "Y");
    }

    private int print(int start, int end, String axisName) {
        while (start < end) {
            System.out.println("Двигаемся по оси " + axisName + " от " + start + " до " + (++start));
        }
        return start;
    }
}


