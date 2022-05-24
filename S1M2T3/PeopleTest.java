/*
	编程实现People类的封装，特征有：姓名、年龄、国籍，要求提供打印所有特征的方法
	编程实现PeopleTest类，main方法中使用有参方式构造两个对象并打印
 */
 public class PeopleTest {

 	public static void main(String[] args) {

 		People p = new People("aj_shang" , 18 , "China");
 		p.show();

 		People p1 = new People("jian" , 26 , "China");
 		p1.show();
 	}
 }