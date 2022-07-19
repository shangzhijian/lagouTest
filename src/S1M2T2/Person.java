package S1M2T2;/*
	编程实现Person类的定义
*/

public class Person{

	String name;
	double age;

	//无参构造
	Person(){
		show();
	}


	//有参构造
	Person(String name , int age){
		setName(name);
		setAge(age);
		System.out.println("正在执行构造方法");
	}

	Person getPerson(){
		return this;
	}

	void show(){
		System.out.println("I'm " + getName() + ", age is " +getAge());
	}

	String getName(){
		return name;
	}

	void setName(String name){
		this.name = name;
	}

	double getAge(){
		return age;
	}

	void setAge(int age){
		this.age = age;
	}

	public static void main(String[] args){

		//1.Person引用指向Person类对象
		Person p = new Person("aj_shang " , 26);
		System.out.println("I'm " + p.getName() + ", age is " +p.getAge());

		//2.使用有参构造
		System.out.println("----------------------------------------");
		Person p2 = new Person();

		System.out.println("p2 = " + p2);

		Person p3 = p2.getPerson();
		System.out.println("p3 = " + p3);
	}
}