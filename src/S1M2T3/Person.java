package S1M2T3;/*
 	编程实现Person类的封装
 	一个Teacher，一个worker之后继承
 */

public class Person {

	//1.私有化成员变量
	private int	age;
	private String name;

	//3.构造方法
	public Person() {}

	public Person(int age , String name) {
		setAge(age);
		setName(name);
	}

	//2.公有的get,set方法
	public int getAge() {
		return age;
	}

	public void setAge(int age) {

		if(age > 0 && age < 150)
			this.age = age;
		else System.out.println("输入的年龄不合符！！！");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//自定义成员方法打印信息
	public void show() {
		System.out.println("我是" + getName() + ", 今年" + getAge() + "岁了！");
	}
	//自定义成员方法描述吃饭行为
	public void eat(String food) {
		System.out.println(food + "真好吃！！");
	}
	//自定义成员方法描述娱乐行为
	public void play(String game) {
		System.out.println(game + "真好玩！！");
	}


}