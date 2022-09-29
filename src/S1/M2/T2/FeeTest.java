package S1.M2.T2;

/*
	编程实现斐波那契数列
	1   1   2    3    5    8。。。
	ia  ib
		ia  ib
			ia 	 ib
 */
public class FeeTest{

	int show(int n){
		if(1 == n || 2 == n) return 1;
		return show(n - 1) + show(n -2);
	}


	//递推
	int ia = 1;
	int ib = 1;
	int show2(int n){
		for(int i = 3 ; i <= n ; i++){
			int ic = ia + ib;
			ia = ib;
			ib = ic;
		}
		return ib;		//ic是块变量，只能在语句块儿中使用，出了for语句块无法使用，所以无法返回；
		
	}

	public static void main(String[] args){

		FeeTest ft = new FeeTest();
		int sum = ft.show(6);
		System.out.println("sum = " + sum);

		sum = ft.show2(6);
		System.out.println("sum2 = " + sum);
	}
}