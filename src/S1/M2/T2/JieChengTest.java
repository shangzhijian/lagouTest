package S1.M2.T2;/*
	编程实现阶乘
 */

public class JieChengTest{

	int show(int n){
		
		int num = 1;
		for(int i = 1 ; i <= n ; i++){
			num *= i; 
		}
		return num;
	}

	int show2(int n){

		if(1 == n) return 1; //n == 1时返回阶乘的结果为1
		return n * show2(n - 1);
	}

	public static void main(String[] args){
		
		JieChengTest jct = new JieChengTest();
		int sum = jct.show(5);

		System.out.println("sum = " + sum);

		int sum2 = jct.show2(5);
		System.out.println("sum2= " + sum2);
	}
}