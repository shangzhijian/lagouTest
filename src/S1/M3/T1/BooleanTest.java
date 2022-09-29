package S1.M3.T1;

public class BooleanTest {

    public static void main(String[] args) {

        // 1.在Java5之前采用方法进行装箱和拆箱
        // 相当于从boolean类型到Boolean类型的转换，装箱
        Boolean bo1 = new Boolean(true);
        System.out.println("bo1 = " + bo1);
        boolean b1 = bo1.booleanValue();
        System.out.println("b1 = " + b1);

        System.out.println("-----------------------------");
        // 2.从Java5开始支持自动装箱和拆箱
        Boolean bo2 = false;
        System.out.println("bo3 = " + bo2);
        boolean b2 = bo2;
        System.out.println("b2 = " + b2);

        System.out.println("-----------------------------");
        // 3.实现从String类型到boolean类型的转换
        //boolean b3 = Boolean.parseBoolean("true");
        //boolean b3 = Boolean.parseBoolean("TRue");    //忽略大小写，调用equals返回与true比较的结果
        boolean b3 = Boolean.parseBoolean("123");
        System.out.println("b3 = " + b3);

    }
}
