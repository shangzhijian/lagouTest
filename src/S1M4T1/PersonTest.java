package S1M4T1;

public class PersonTest {

    public static void main(String[] args) {

        /*Person p = null;
        try {
            p = new Person("zhangfei", -15);
        } catch (AgeException e) {
            e.printStackTrace();
        }*/
        Person p = new Person("zhangfei", -10);
        System.out.println("p = " + p);     //在set里面处理后，对象创建成功，zhangfei 0 ;一路抛出后是null，对象创建失败
    }
}
