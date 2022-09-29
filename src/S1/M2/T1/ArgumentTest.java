package S1.M2.T1;/*
	编程测试参数传递的功能
 */

public class ArgumentTest{



	//自定义方法show接受指定参数传递的整数值（基本数据类型测试）
	void show1(int a){
		a = 18;
		System.out.println("show：我今年" + a + "岁了");
	}
	//自定义方法show2接受指定参数传递的数组值（引用数据类型测试）
	void show2(int[] arr){
		arr[0] = 18;
		System.out.println("show：arr[0] = " + arr[0]);
	}

	//自定义方法show2接受指定参数传递的数组值（引用数据类型测试）
	void show3(int[] arr){
		int[] brr = new int[]{0,0};
		arr = brr;//改变指向
		arr[0] = 100;
		System.out.println("show：arr[0] = " + arr[0]);
	}




	public static void main(String[] args){

		//1.声明ArgumentTest引用指向该对象
		ArgumentTest at = new ArgumentTest();

		//2.调用成员方法show1打印，测试基本数据类型传递特点
		int ia = 26;
		at.show1(ia);
		System.out.println("ia = " + ia);	//ia = 26

		//3.调用成员方法show2打印，测试引用数据类型传递特点
		System.out.println("--------------------");
		int[] test = new int[]{26 , 26};
		at.show2(test);
		System.out.println("test[0] = " + test[0]); //test[0] = 18;

		//4.调用成员方法show2打印，测试引用数据类型传递特点
		System.out.println("--------------------");
		at.show3(test);	//test[18 , 26]
		System.out.println("test[0] = " + test[0]); //test[0] = 18;

		
	}
}