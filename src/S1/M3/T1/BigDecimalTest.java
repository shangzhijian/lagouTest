package S1.M3.T1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalTest {

    public static void main(String[] args) {

        // 1.构造两个BigInteger类型的对象并指定初始值
        BigDecimal bd1 = new BigDecimal("3.1");
        BigDecimal bd2 = new BigDecimal("3.2");

        // 2.实现加减乘除取余操作并打印
        System.out.println("bd1 + bd2 = " + bd1.add(bd2));
        System.out.println("bd1 - bd2 = " + bd1.subtract(bd2));
        System.out.println("bd1 * bd2 = " + bd1.multiply(bd2));
        System.out.println("bd1 / bd2 = " + bd1.divide(bd2));

        System.out.println("---------------------------------------------------------------");
        // 3.实现精确运算
        double d1 = 3.2;
        double d2 = 3.1;
        System.out.println("d1 + d2 = " + (d1+ d2));   // 6.300000000000001
        System.out.println("bd1 + bd2 精确运算= " + bd1.add(bd2));

        System.out.println("---------------------------------------------------------------");
        // 4.注意事项
        BigDecimal bd5 = new BigDecimal("2");
        BigDecimal bd6 = new BigDecimal("0.3");
        System.out.println("除法运算的结果是：" + bd5.divide(bd6 , RoundingMode.HALF_UP)); // 7,查手册：HALF_UP 为枚举值：舍入模式向“最近邻居”舍入，除非两个邻居等距，在这种情况下向上舍入。

    }
}
