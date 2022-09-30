package S1.M2.T2;/*
	编程实现阶乘
 */

import java.util.Scanner;

public class JieChengTest{

	public static int jieCheng(int n) {
		//5 = 5 * 4!
		//4! = 4 * 3!
		//3! = 3 * 2!
		//2 = 2 * 1！
		//1！ = 1
		//n  = n * (n - 1)!
		if (1 == n) return 1;
		else return n * jieCheng(n - 1);
	}

	public static void main(String[] args) {

		//1 输入一个正整数，要进行阶乘运算，并使用变量保存
		System.out.println("请输入一个正整数");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();

		//2 调用阶乘的方法，返回结果
		int res = jieCheng(i);

		//3 获取返回值并打印
		System.out.println(i + "的阶乘是" + res);
	}
}