package S1.M2.T5;

public class AnonymousInterfaceTest {

    public static void show(AnonymousInterface ai) {
        ai.show();
    }

    public static void main(String[] args) {

        // 1
        AnonymousInterfaceTest.show(new AnonymousInterfaceImpl());

        // 2 匿名内部类  接口/父类类型 引用 = new 接口/父类类型对象（）{方法体};
        AnonymousInterface ait = new AnonymousInterface() {
            @Override
            public void show() {
                System.out.println("匿名内部类！");
            }
        };

        // 3
        AnonymousInterface ait2 = () ->{
            System.out.println("并不难哦！");
        };

        AnonymousInterfaceTest.show(ait2);
    }
}
