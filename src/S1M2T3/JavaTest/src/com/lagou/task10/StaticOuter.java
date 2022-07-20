package S1M2T3.JavaTest.src.com.lagou.task10;

public class StaticOuter {

    private int cnt = 1;
    private static int snt = 2;

    public static class StaticInter {

        private int ia = 1;

        public StaticInter() {

            System.out.println("静态内部类的构造方法！");
        }

        public void show() {
            System.out.println("ia = " + ia);
            System.out.println("snt = " + snt);
        }

    }
}
