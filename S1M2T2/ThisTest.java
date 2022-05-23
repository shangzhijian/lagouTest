/*
	编程实现this关键字的使用
 */

public class ThisTest{

	ThisTest(){
		System.out.println("构造方法里的this:" + this);
	}

	void show(){
		System.out.println("自定义方法里的this:" + this);
	}

	public static void main(String[] args){

		ThisTest tt = new ThisTest();
		System.out.println("-------------");
		tt.show();
		System.out.println("-------------");
		System.out.println("main方法的tt:" + tt);
	}
}