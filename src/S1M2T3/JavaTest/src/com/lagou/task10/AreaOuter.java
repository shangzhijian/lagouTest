package S1M2T3.JavaTest.src.com.lagou.task10;

public class AreaOuter {

    private int aot = 1;

    public void show() {

        final int t1 = 2;

        //定义局部内部类
        class AreaInner {

            private int ait = 2;

            //局部内部类构造方法
            public AreaInner() {
                System.out.println("局部内部类构造方法！！！");
            }

            //自定义方法
            public void test() {
                System.out.println("ait = " + ait);
                System.out.println("aot = " + aot);

                System.out.println("------------------------");
                System.out.println("t1 = " + t1);
            }

        }

        //在show中，局部内部类外创建对象
        AreaInner ai = new AreaInner();
        ai.test();
    }
}
