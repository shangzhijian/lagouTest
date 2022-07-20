package S1M2T3.JavaTest.src.com.lagou.task10;

public class StaticOuterTest {

    public static void main(String[] args) {

        //静态内部类的引用指向静态内部的对象
        StaticOuter.StaticInter in = new StaticOuter.StaticInter();
        in.show();

    }
}
