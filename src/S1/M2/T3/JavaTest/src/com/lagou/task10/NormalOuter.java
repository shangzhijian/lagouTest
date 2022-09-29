package S1.M2.T3.JavaTest.src.com.lagou.task10;

public class NormalOuter {

    private int cnt = 1;

    public NormalOuter() {
        System.out.println("外部类构造方法！！");
    }

    public class NormalInner {

        private int ia = 2;
        private int cnt = 2;

        public NormalInner() {
            System.out.println("Inner类构造！！！");
        }

        public void show() {

            System.out.println("外部类中的cnt = " + cnt);
            System.out.println("内部类中的ia = " + ia);
        }

        public void show2(int cnt) {
            System.out.println("cnt = " + cnt);
            System.out.println("内部类中的cnt = " + this.cnt);
            System.out.println("外部类中的cnt = " + NormalInner.this.cnt);
        }
    }
}
