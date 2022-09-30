package S1.M2.T3;/*
	编程实现SingletonTest类的测试
 */

public	class SingletonTest {

	public static void main(String[] args) {

		//1 获取Singleton类型引用指向该类型的对象
		Singleton s1 = Singleton.get();
		Singleton s2 = Singleton.get();
		System.out.println((s1 == s2 ) ? "true" : "false");
	}
}