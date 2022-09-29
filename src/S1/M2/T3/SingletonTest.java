package S1.M2.T3;/*
	编程实现SingletonTest类的测试
 */

public	class SingletonTest {

	public static void main(String[] args) {


		//在Singleton类中的 private Singleton(){} 限制了创造对象
		//Singleton sin3 = new Singleton();

		//只能创建一个对象，已经在Singleton中定义过了，测试类中无法定义
		Singleton sin1 = Singleton.getInstence();
		Singleton sin2 = Singleton.getInstence();
		System.out.println(sin1 == sin2);			//true
	}
}