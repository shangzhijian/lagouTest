/*
	编程实现整数类型的使用
 */

public class IntTest {

	public static void main(String[] args) {

		byte b1 = 'a';
		System.out.println("b1 = " + b1);            //97

		byte b2 = 97;
		System.out.println("b2 = " + (char)b2);      //a	
		
		System.out.println("-----------------------");
		short s1 = 250;
		short s2 = (short)250250;                           //possible lossy,需要强转
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);

		System.out.println("-----------------------");
		int i1 = 250250;
		//int i2 = 250250250250;                     //too large
		//int i3 = 250250250250L;				 	 //possible lossy

		System.out.println("i1 = " + i1);

		System.out.println("-----------------------");
		int i2 = 25;
		short s3 = 25;
		System.out.println("s3 = " + s3);

	}
}