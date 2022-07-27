package S1M3T5;

public class SubPersonTest {

    public static void main(String[] args) {

        // 1.声明SubPerson类型的引用指向SubPerson类型的对象并调用set方法进行测试
        //SubPerson<String> sb1 = new SubPerson<>();    //SubPerson不保留泛型时，无法指定泛型
        SubPerson sp1 = new SubPerson();
        sp1.setGender(1);     //SubPerson不保留泛型时,gender默认为Object类型
                                //SubPerson保留泛型时,初始化不指定泛型,gender默认为Object类型

        System.out.println("----------------------------------------");
        //SubPerson<String> sp2 = new SubPerson<>();
        SubPerson<Boolean,Long> sb2 = new SubPerson<>();
        sb2.setGender(false);

    }
}
