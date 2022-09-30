package S1.M2.T5;

public class NormalOuterTest {

    public static void main(String[] args) {

        NormalOuter no = new NormalOuter();
        NormalOuter.NormalInner ni = no.new NormalInner();
        ni.show();

        ni.show(4);
    }
}
