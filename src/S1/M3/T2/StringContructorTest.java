package S1.M3.T2;

public class StringContructorTest {

    public static void main(String[] args) {

        // 1.使用无参方式构造对象并打印
        String str1 = new String();
        // "" 表示空字符串对象，有对象只是里面没有内容
        // null 表示空，连对象都没有
        System.out.println("str1 = " + str1);

        System.out.println("----------------------------------------------------");
        // 2.使用参数指定的byte数组来构造对象并打印
        //'a' - 97
        byte[] bArr = {97, 98, 99, 100, 101} ; //abcde
        // 使用字节数组中的一部分内容来构造对象，表示使用数组bArr中下标从1开始的3个字节构造字符串对象
        // 构造字符串的思路：就是先将每个整数翻译成对应的字符，再将所有的字符串起来。
        // 98 - 'b'   99 - 'c'  100 - 'd'   => bcd
        String str2 = new String(bArr,2,3);
        System.out.println("str2 = " + str2);       //cde

        // 使用整个字节数组来构造字符串对象
        String str3 = new String(bArr);
        System.out.println("str3 = " + str3);       // abcde


        System.out.println("----------------------------------------------------");
        // 3.使用字符数组来构造字符串对象
        char[] cArr = {'a', 'b', 'c' ,'d' ,'e'};
        // 使用字符数组中的一部分内容来构造对象
        // 思路：直接将字符串起来
        String str4 = new String(cArr, 2, 2);
        System.out.println("str4 = " + str4); // ll

        String str5 = new String(cArr);
        System.out.println("str5 = " + str5);

        System.out.println("----------------------------------------------------");
        // 4.使用字符串来构造字符串对象
        String str6 = new String("hello");
        System.out.println("str6 = " + str6);
    }
}
