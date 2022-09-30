package S1.M2.T4;

public class Rect extends Shape{

    private int width;
    private int length;

    public Rect() {
    }

    public Rect(int x,int y, int width, int length) {
        super(x, y);
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width > 0) this.width = width;
        else System.out.println("宽度不能小于0");
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length > 0) this.length = length;
        else System.out.println("长度不能小于0");
    }

    @Override
    public void show() {
        super.show();
        System.out.println("width =" + getWidth() + ", length =" + getLength());
    }
}
