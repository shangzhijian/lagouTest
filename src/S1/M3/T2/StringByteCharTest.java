package S1.M3.T2;

public class StringByteCharTest {

    public static void main(String[] args) {

        // 1.创建String类型的对象并打印
        String str1 = new String("world");
        System.out.println("str1= " + str1);

        // 2.实现将String类型转换为byte数组类型并打印
        // 思路：先将字符串拆分为字符，将再每个字符转换为byte类型，也就是获取所有字符的ASCII
        byte[] bArr = str1.getBytes();
        for (int i = 0; i < bArr.length; i++) {
            System.out.println("下标为" + i + "的元素是" + bArr[i]);
        }
        // 将byte数组转回String类型并打印
        String str2 = new String(bArr);
        System.out.println("str2 = " + str2);

        System.out.println("-----------------------------------------------");
        // 3.实现将String类型转换为char数组类型并打印
        // 思路：将字符串拆分为字符并保存到数组中
        char[] cArr = str2.toCharArray();
        for (int i = 0; i < cArr.length; i++) {
            System.out.println("下标为" + i + "的元素是" + cArr[i]);
        }
        // 将char数组转回String类型并打印
        String str3 = new String(cArr);
        System.out.println("str3 = " + str3);
    }
}
