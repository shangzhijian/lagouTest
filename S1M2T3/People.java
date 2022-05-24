/*
	编程实现People类的封装，特征有：姓名、年龄、国籍，要求提供打印所有特征的方法
	编程实现PeopleTest类，main方法中使用有参方式构造两个对象并打印
 */
public class People {

	//1.私有化成员变量
	private String name;
	private int age;
	public static String country = "American";


	//3.构造方法调用set方法
	public People() {};

	public People(String name , int age , String country) {
		
		setName(name);
		setAge(age);
		setCountry(country);
	}

	//2.公有化get，set方法
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age > 0 && age < 150) this.age = age;
		else System.out.println("输入的年龄不合理哦!!!");
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void show() {
		System.out.println("我叫" + getName() + ", 今年" + getAge() + "岁了，来自" + getCountry() + "国");
	}
}