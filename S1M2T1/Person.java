/*
	编程实现Person，打印年龄和姓名的属性
 */

public class Person{


	String name ;
	int age;

	//自定义成员方法将成员变量修改为参数指定值
	void setName(String name){
		this.name = name;
	}

	void setAge(int age){
		this.age = age;
	}

	void show(){
		System.out.println("我是" + name + ", 今年" + age + "岁");//不用再加上p.变量名访问
	}

	//可变长参数的实现
	void showArgument(int num , String... str){
		System.out.println("num = " + num);
		for(int i = 0 ; i < str.length ; i++){
			System.out.println("第" + (i+1) + "个可变长参数str为" + str[i]);
		}
	}

	public static void main(String[] args){

		//1.声明Person类引用指向Person类对象
		Person p = new Person();

		//2.打印对象的的成员变量
		//System.out.println("我是" + p.name + ", 今年" + p.age + "岁");
		p.show();

		//3.修改成员变量的值
		p.name = "aj_shang";
		p.age = 26;

		//4.再次打印成员变量的值
		p.show();
		System.out.println("---------------------------------------");

		//5.调用成员方法修改成员变量
		p.setName("shang");
		p.setAge(18);
		p.show();

		//6.调用可变长参数
		System.out.println("---------------------------------------");
		p.showArgument(1);
		p.showArgument(18 , "shang");
		p.showArgument(26, "aj_shang" , "hello");

	}
}