package S1M2T3.JavaTest.src.com.lagou.task09;

public class ShapeTest {

    public static void draw(Shape s){
        s.show();
    }

    public static void main(String[] args) {

        //Rect类型引用指向Rect类型对象
        Rect r = new Rect(1,2,3,4);
        r.show();
        System.out.println("------------------");

        //Circle类型引用指像Circle类型对象
        Circle c = new Circle(5,6,2);
        c.show();
        System.out.println("------------------");

        //即打印Rect类型特征又打印Circle类型特征
        //Rect r = new Rect(1,2,3,4);
        //Circle c = new Circle(5,6,2);
        ShapeTest.draw(new Rect(1,2,3,4));
        ShapeTest.draw(new Circle(5,6,2));
    }
}
