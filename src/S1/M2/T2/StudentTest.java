package S1.M2.T2;/*
	编程实现：提示用户输入班级的学生人数，以及每个学生的信息，学生的信息有：学号，姓名；最后打印出来
	注意点：Student[] st = new Student[num];
 */

import java.util.Scanner;

public class StudentTest {


	public static void main(String[] args){

		//1.提示用户输入班级学生数，并使用变量记录
		System.out.println("请输入学生数！");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		//2.记录学生人数，并准备存入学生信息的数组
		Student[] st = new Student[num];

		//3.提示用户输入第 i+1 个学生的信息
		for (int i = 0; i < num; i++) {
			System.out.println("请输入第" + (i + 1) + "个学生的信息（学号和姓名）");
			st[i] = new Student(sc.nextInt(),sc.next());
		}

		//4.输出学生的信息
		for (Student s: st) {
			System.out.println(s.getId() + ", " + s.getName());
		}

/*
		//1.提示用户输入班级学生数，并使用变量记录
		System.out.println("请输入班级人数");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		//2.记录学生人数，并准备存入学生信息的数组
		Student[] arr = new Student[num];

		//3.提示用户输入第 i+1 个学生的信息
		for(int i = 0 ; i < num ; i++){

			System.out.println("请输入第" + (i+1) + "个学生的信息");
			arr[i] = new Student(sc.nextInt() , sc.next());			//使用新特性时：Error：java.lang.IllegalAccessError
		}

		//4.输出学生的信息
		for(int i = 0 ; i < num ; i++) {

			arr[i].show();
		}
*/
	}
}