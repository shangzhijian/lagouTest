package S1M3T2;

public class StringIndexTest {

    public static void main(String[] args) {

        // 1.构造String类型的对象并打印
        String str1 = new String("Good Good Study, Day Day Up!");
        System.out.println("str1 = " + str1);
        // 2.实现字符串中指定字符和字符串的查找功能
        int pos = str1.indexOf('g');
        System.out.println("pos = " + pos);     //-1代表查找失败
        pos = str1.indexOf('G');
        System.out.println("pos = " + pos);     //返回该字符第一次出现的索引位置
        // 表示从下标0开始查找字符'G'第一次出现的索引位置，包含0
        pos = str1.indexOf('G',0);
        System.out.println("pos = " + pos);     //0
        pos = str1.indexOf('G',1);
        System.out.println("pos = " + pos);     //5

        System.out.println("------------------------------------------------------");
        // 查找字符串
        pos = str1.indexOf("God");
        System.out.println("pos = " + pos);              //-1
        pos = str1.indexOf("Study");
        System.out.println("pos = " + pos);             //10
        pos = str1.indexOf("Good",0);
        System.out.println("pos = " + pos);             //0 字符串中第一个字符的下标
        pos = str1.indexOf("Good",1);
        System.out.println("pos = " + pos);             //5 字符串中第一个字符的下标

        System.out.println("------------------------------------------------------");
        // 编写通用代码实现将字符串str1中所有"Day"出现的索引位置找到并打印出来
        pos = str1.indexOf("Day");
        while(-1 != pos) {
            System.out.println("pos = " + pos);
            pos = str1.indexOf("Day", pos + "Day".length());
        }

        System.out.println("------------------------------------------------------");
        // 优化一下
        pos = 0;
        while ((pos = str1.indexOf("Day",pos)) != -1) {
            System.out.println("pos = " + pos);
            pos += "Day".length();
        }

        System.out.println("------------------------------------------------------");
        // 3.实现字符和字符串内容的反向查找
        pos = str1.lastIndexOf('G');
        System.out.println("pos = " + pos);         //5
        pos = str1.lastIndexOf('G',5);
        System.out.println("pos = " + pos);         //5
        pos = str1.lastIndexOf('G',6);
        System.out.println("pos = " + pos);         //5
        pos = str1.lastIndexOf('G',4);
        System.out.println("pos = " + pos);         //0

        System.out.println("------------------------------------------------------");
        pos = str1.lastIndexOf("Day");
        System.out.println("pos = " + pos);         //21
        pos = str1.lastIndexOf("Day",21);
        System.out.println("pos = " + pos);         //21
        pos = str1.lastIndexOf("Day",20);
        System.out.println("pos = " + pos);         //17
        pos = str1.lastIndexOf("Day",15);
        System.out.println("pos = " + pos);         //-1
    }
}
