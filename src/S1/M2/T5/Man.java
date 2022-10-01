package S1.M2.T5;

@Mantype(value = "职工")
//@Mantype(value = "超人")
public class Man {

    @Deprecated
    public void show() {
        System.out.println("测试过时方法");
    }

    public static void main(String[] args) {
        int ia = 97;
        char c1 = (@Mantype char)ia;
    }
}
