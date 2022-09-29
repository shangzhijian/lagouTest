package S1.M2.T3.JavaTest.src.com.lagou.task10;

public class NormalOuterTest {

    public static void main(String[] args) {

        //外部类引用指向外部类的对象
        NormalOuter no = new NormalOuter();

        //内部类引用指向内部类的对象
        NormalOuter.NormalInner ni = no.new NormalInner();

        //调用内部类的show
        ni.show();
        ni.show2(5);
    }
}
