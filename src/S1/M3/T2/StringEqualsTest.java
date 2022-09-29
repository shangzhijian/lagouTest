package S1.M3.T2;

import java.util.Scanner;

public class StringEqualsTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            // 1.提示用户从键盘输入用户名和密码信息并使用变量记录
            System.out.println("请输入您的用户名和密码信息");
            String userName = sc.next();
            String password = sc.next();

            // 2.判断用户名和密码是否为"admin"和"123456"并给出提示,最多3次
            if("admin".equals(userName) && "123456".equals(password)) {
                System.out.println("登录成功，欢迎使用");
                break;
            }
            if (2 == i) System.out.println("错误次数达到最大，请联系管理员!");
            else{
                System.out.println("输入错误，还有" + (3-i-1) + "次机会！");
            }
        }

        //关闭扫描器
        sc.close();


    }
}
