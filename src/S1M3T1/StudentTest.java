package S1M3T1;
/*
	Student测试类
*/
public class StudentTest {

	public static void main(String[] args) {
		
		Student s1 = new Student(1001,"zhangfei");
		//System.out.println(s1.getId());
		Student s2 = new Student(1002,"guanyu");
		Student s3 = null;
		Student s4 = new Student(1001,"liubei");

		System.out.println("s1是 " + s1);
		System.out.println("s2是 " + s2);
		System.out.println("s2是 " + s3);

		//s2 = s1; //指向同一对象测试比较地址
		System.out.println("==判断地址为" + (s1 == s2));//false
		System.out.println("equals判断为" + s1.equals(s2));

		System.out.println("s1hashCode值为" + s1.hashCode());
		System.out.println("s2hashCode值为" + s2.hashCode());

		System.out.println("-----------------------------------");
//		以学号和姓名同时作为基准
		System.out.println("s1 and s4 , equals判断" + s1.equals(s4));
		System.out.println(System.getProperty("file.encoding"));



	}
}