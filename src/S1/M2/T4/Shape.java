package S1.M2.T4;


public class Shape {

    private int x;
    private int y;

    Shape() {}

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void show() {
        System.out.println("x = " + getX() + ", y =" + getY());
    }
}
