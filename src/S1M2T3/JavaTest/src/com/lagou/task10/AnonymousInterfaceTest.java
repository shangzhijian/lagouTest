package S1M2T3.JavaTest.src.com.lagou.task10;

public class AnonymousInterfaceTest {

    //假设已有下面的方法，请问如何调用下面的方法？
    // AnonymousInterface a = new AnonymousInterfaceImpl();
    // 接口类型的引用指向实现类型的对象，形成了多态
    public static void test (AnonymousInterface ai) {
        ai.show();
    }

    public static void main(String[] args) {

        AnonymousInterfaceTest.test(new AnonymousInterfaceImpl());
    }
}


