package S1M2T2;/*
	编程实现：提示用户输入班级的学生人数，以及每个学生的信息，学生的信息有：学号，姓名；最后打印出来
	注意点：Student[] st = new Student[num];
 */

public class Student{

	//1.私有化成员变量
	private int id;
	private String name;

	//无参构造
	Student(){}

	//有参构造
	Student(int id ,String name){
		setId(id);
		setName(name);
	}

	//2.共有的get set方法，进行合理判断
	public int getId(){
		return id;
	}

	public void setId(int id){
		if(id > 0) this.id = id;
		else System.out.println("输入ID不合法哦！！！");
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}


	void show(){
		System.out.println("我的姓名是" + getName() + ",学号是" + getId());
	}


}