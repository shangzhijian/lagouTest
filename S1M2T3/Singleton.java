/*
	编程实现singleton类的封装
 */

public class Singleton {

	//2.声明本类对象引用指向本类型对象==========>对应于普通的私有化成员变量
	private static Singleton sin = new Singleton();

	//1.私有化构造方法 ====》让只能创建一个对象
	private Singleton() {}

	//3.提供共有的get方法负责将对象返回，
	public static Singleton getInstence() {
		return sin;
	}
}