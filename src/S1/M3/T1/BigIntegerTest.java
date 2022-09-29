package S1.M3.T1;

import java.math.BigInteger;

public class BigIntegerTest {

    public static void main(String[] args) {

        // 1.构造两个BigInteger类型的对象并指定初始值
        BigInteger bi1 = new BigInteger("3");
        BigInteger bi2 = new BigInteger("4");

        System.out.println("bi1 + bi2 = " + (bi1.add(bi2)));
        System.out.println("bi1 - bi2 = " + (bi1.subtract(bi2)));
        System.out.println("bi1 * bi2 = " + (bi1.multiply(bi2)));
        System.out.println("bi1 / bi2 = " + (bi1.divide(bi2)));
        System.out.println("bi1 % bi2 = " + (bi1.remainder(bi2)));

        System.out.println("-----------------------------------------------------");
        // 3.一次性得到商和余数
        BigInteger[] bi = bi1.divideAndRemainder(bi2);
        for (int i = 0 ; i < bi.length ; i++){
            System.out.println("下标为" + i + "的元素是" + bi[i]);
        }
    }
}
