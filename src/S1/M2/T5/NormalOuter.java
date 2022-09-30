package S1.M2.T5;

public class NormalOuter {
    private int cnt = 1;

    public class NormalInner {

        private int ia = 11;
        private int cnt = 2;

        public NormalInner() {
        }

        public void show() {
            System.out.println("cnt = " + NormalOuter.this.cnt);    //1
        }

        public void show(int cnt) {
            System.out.println("cnt = " + cnt);     //4
            System.out.println("cnt = " + this.cnt);    //2
            System.out.println("cnt = " + NormalOuter.this.cnt);    //
        }
    }
}
