package S1.M2.T3;/*
	编程实现main方法的测试
 */

public class MainTest {

	public static void main(String[] args) {

		System.out.println("参数的个数是" + args.length);
		System.out.println("参数是");
		for(int i = 0 ; i < args.length ; i++) {
			System.out.println("第" + (i+1) + "个参数是" + args[i]);
		}
	}
}