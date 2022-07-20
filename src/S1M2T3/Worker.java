package S1M2T3;

/*
	自定义worker类继承Person类
	独有属性是薪水,行为是工作
 */
public class Worker extends Person {

	//1.私有化成员变量
	private int salary;

	//3.构造
	public Worker() {
		super();
		System.out.println("Worker()");
	}

	public Worker(int age , String name , int salary) {
		
		super(age , name);
		setSalary(salary);
		System.out.println("Worker(age , name , salary)");
	}

	//2.get,set方法
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		if(salary < 2200) 
			System.out.println("输入的薪水不合理哦！！！");
		else 
			this.salary = salary;
	}

	//自定义成员方法描述工作
	public void work() {
		System.out.println("工作中。。。");
	}

	//重写show()
	@Override
	public void show() {
		System.out.println("我是" + getName() + ", 今年" + getAge() + "岁了！" + "薪资是" + getSalary());
		//System.out.println("薪资是" + getSalary());
	}


}