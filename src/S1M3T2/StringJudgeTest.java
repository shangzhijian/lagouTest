package S1M3T2;

public class StringJudgeTest {

    public static void main(String[] args) {

        // 1.创建字符串对象并打印
        String str1 = "上海自来水来自海上";
        System.out.println("str1 = " + str1);
        // 2.判断该字符串内容是否为回文并打印
        for (int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) != (str1.charAt(str1.length() - 1 - i))) {
                System.out.println("str1不是回文字符串");
                return;
            }
        }
        System.out.println("str1是回文字符串");
    }
}
