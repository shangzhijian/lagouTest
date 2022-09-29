package S1.M1.T4;
/*
    编程使用while循环实现任意正整数的反向输出
 */


import java.util.Scanner;

public class WhileReverseTest {

    public static void main(String[] args) {

        //1 提示输入任意正整数，使用变量保存
        System.out.println("请输入一个正整数");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = 0;

        while (num != 0){

            //2 每次取出最低位，用变量保存，
            // 123 % 10 => 3 ; 123 / 10 => 12
            res = res * 10 + num % 10;   //3  32
            num = num / 10;  //12  1
        }
        //3 结果累加并打印
        System.out.println("reverse = " + res);
    }
}
