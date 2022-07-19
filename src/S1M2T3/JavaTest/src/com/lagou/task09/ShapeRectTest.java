/*
    编程实现ShapeRectTest类，在main方法中分别创建Shape和Rect类型对象并打印特征
*/

package S1M2T3.JavaTest.src.com.lagou.task09;

public class ShapeRectTest {

    public static void main(String[] args) {

        Shape s = new Shape(1,2);
        s.show();

        System.out.println("---------------");

        Rect r = new Rect(1,3,4,5);
        r.show();

        System.out.println("---------------");
        Shape s2 = new Rect(7,8,9,10);
        s2.show();

        //静态父类，子类都有的静态方法
        s2.test();
        System.out.println("---------------");
        Shape.test();
    }

}
