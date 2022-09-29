package S1.M3.T2;

import java.util.Scanner;

public class StringRegTest {

    public static void main(String[] args) {

        // 1.定义描述规则的正则表达式字符串并使用变量记录
        // 正则表达式只能对数据格式进行验证，无法对数据内容的正确性进行检查，内容的正确性检查需要后台查询数据库
        // 描述银行卡密码的规则：由6位数字组成
        // String reg = "^[0-9]{6}$";
        // String reg = "[0-9]{6}";
        //String reg = "\\d{6}";

        // 使用正则表达式描述一下QQ号码的规则：要求是由非0开头的5~15位数字组成。
        //String reg = "0\\d{4,15}";

        //使用正则表达式描述一下手机号码的规则：要求是由1开头，第二位数是3、4、5、7、8中的一位，总共11位
        //String reg = "1[34578]\\d{9}";

        //描述身份证号码的规则：总共18位，6位数字代表地区，4位数字代表年，2位数字代表月，2位数字代表日期， 3位数字代表个人，
        // 最后一位可能数字也可能是X。
        //String reg = "(\\d{6}) (\\d{4}) (\\d{2}) (\\d{2}) (\\d{3}) ([0-9|X])"; //括号之间不能加空格
        //String reg = "(\\d{6})(\\d{4})(\\d{2})(\\d{2})(\\d{3})([0-9|X])";
        String reg = "(\\d{6})(\\d{4})(\\d{2})(\\d{2})(\\d{3})([\\d|X])";

        // 2.提示用户从键盘输入指定的内容并使用变量记录
        //System.out.println("请输入6位数字密码:");
        //System.out.println("请输入QQ号码：");
        //System.out.println("请输入手机号：");
        System.out.println("请输入身份号：");
        Scanner sc = new Scanner(System.in);
        while (true) {
            String str = sc.next();
            // 3.判断用户输入的字符串内容是否满足指定的规则并打印
            if (str.matches(reg)) {
                System.out.println("输入成功");
                break;
            }
            System.out.println("输入非法！");
        }
    }
}
