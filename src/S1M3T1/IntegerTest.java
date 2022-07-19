package S1M3T1;

public class IntegerTest {

    public static void main(String[] args) {

        // 1.打印Integer类中常用的常量数值
        System.out.println("Max = " + Integer.MAX_VALUE);
        System.out.println("Min = " + Integer.MIN_VALUE);
        System.out.println("二进制补码位数" + Integer.SIZE);
        System.out.println("int类型所占字节数" + Integer.BYTES);
        System.out.println("int类型返回的Class实例" + Integer.TYPE);

        System.out.println("------------------------------------------------------");
        // 2.使用构造方法来构造Integer类型的对象并打印
        Integer it1 = new Integer(123);  // 自动调用toString方法
        Integer it2 = new Integer("123");   // 能转化为数字的字符串
        System.out.println("it1=" + it1);
        System.out.println("it2=" + it2);
        // 上述方法已过时，建议使用valueOf方法取代之，相当于从int类型到Integer类型的转换，叫做装箱
        Integer it3 = Integer.valueOf(456);
        Integer it4 = Integer.valueOf("456");
        System.out.println("it3=" + it3);
        System.out.println("it4=" + it4);
        // 获取调用对象中的整数数值，相当于从Integer类型到int类型的转换，叫做拆箱
        int i = it4.intValue();
        System.out.println("读取到的整数i = " + i);

        System.out.println("------------------------------------------------------");
        // 3.从Java5开始增加了自动装箱和自动拆箱的机制
        Integer it5 = 789;
        int i2 = it5;

        System.out.println("------------------------------------------------------");
        // 4.装箱和拆箱的笔试考点
        Integer it6 = 127; //128;
        Integer it7 = 127; //128;
        Integer it8 = new Integer(127);
        Integer it9 = new Integer(127);
        System.out.println(it6 == it7);         //地址 true
        System.out.println(it6.equals(it7));    //内容 true
        System.out.println(it8 == it9);         //地址 false
        System.out.println(it8.equals(it9));    //内容 true

        System.out.println("------------------------------------------------------");
        // 5.实现静态方法的调用
        int ic = Integer.parseInt("200");
        //int ic = Integer.parseInt("200a"); // 编译ok,运行发生NumberFormatException数字格式异常，因为有字母
        System.out.println("字符串转换为整数:" + ic);
        System.out.println("整数转化为十进制字符串" + Integer.toString(123));
        System.out.println("整数转化为二进制字符串" + Integer.toBinaryString(123));
        System.out.println("整数转化为十六进制字符串" + Integer.toHexString(123));
        System.out.println("整数转化为二进制字符串" + Integer.toOctalString(123));

    }
}
