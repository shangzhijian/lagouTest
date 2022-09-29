package S1.M3.T2;

public class StringManyMethodTest {

	public static void main(String[] args) {

		 // 1.构造String类型的对象并打印
		String str1 = "    Let Me Give You Some Color To See See";
		System.out.println("str1 = " + str1);

		// 2.实现各种成员方法的调用和测试
		boolean b1 = str1.contains("you");	//区分大小写
		System.out.println("b1 = " + b1);
		b1 = str1.contains("To");
		System.out.println("b1 = " + b1);

		System.out.println("----------------------------------------------");
        // 将所有字符串转换为大写  小写  以及去除两边的空白字符
		String str2 = str1.toLowerCase();
		System.out.println("Str2 = " + str2);
		System.out.println("转换后str1 = " + str1);
		str2 = str1.toUpperCase();
		System.out.println("Str2 = " + str2);
		System.out.println("转换后str1 = " + str1);	

		str2 = str1.trim();
		System.out.println("去除空白后Str2 = " + str2);
		System.out.println("去除空白后Str1 = " + str1);	

         System.out.println("----------------------------------------------");
        // 判断字符串是否以...开头  以...结尾
        //去除空白后Str2 = Let Me Give You Some Color To See See
        b1 = str2.startsWith("L");
        System.out.println("b1 = " + b1);
        b1 = str2.endsWith("See");
        System.out.println("b1 = " + b1);

        // 从下标5开始是否以"Let"开头
        //str1 = "    Let Me Give You Some Color To See See"
        b1 = str1.startsWith("Let" , 4);
        System.out.println("b1 = " + b1);
	}
}