package S1.M2.T3;/*
	编程实现singleton类的封装
 */

public class Singleton {

	//1 私有化构造方法，private static 修饰
	private Singleton() {}
	//2 Singleton 类型引用指向该类类型的对象 private static 修饰
	private static Singleton sin = new Singleton();
	//3 提供get方法返回对象，public static 修饰
	public static Singleton get() {
		return sin;
	}
}