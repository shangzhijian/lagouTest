
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarTest {
	
	public static void main(String[] args) {

		// 1.使用过时的方法按照指定的年月日时间分来构造对象
		Date d1 = new Date(2008 - 1900, 8 - 1, 8, 20, 8, 8);
		System.out.println("d1 = " + d1);
		// 2.设置日期对象的格式并打印
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String str1 = sdf.format(d1);
		System.out.println("转换后的日期为：" + str1);			// 2008 8 8 20 8 8

		System.out.println("-----------------------------------------------------");
        // 2.使用取代的方式按照指定的年月日时分秒来构造对象
        // 2.1 获取Calendar类型的引用
        // 考点：既然Calendar是个抽象类不能创建对象，那么下面的方法为啥可以获取Calendar类型的引用呢？
        // 解析：由源码可知，返回的并不是Calendar类型的对象，而是Calendar类的子类GregorianCalendar等对象，形成了多态
        // 多态的使用场合之三
        Calendar instance = Calendar.getInstance();
        // 2.2 设置指定的年月日时分秒信息
        instance.set(2008, 8-1, 8, 20, 8, 8);
        // 2.3 转换为Date类型的对象
        Date d2 = instance.getTime();
        String str2 = sdf.format(d2);
        System.out.println("Calendar转换后的日期为： " + str2);	// 2008-08-08 08:08:08

        System.out.println("-----------------------------------------------------");
        // 3.向指定的字段设置以及增加指定的数值
        instance.set(Calendar.YEAR, 2022);
        d2 = instance.getTime();
        String str3 = sdf.format(d2);
        System.out.println("设置后的日期为： " + str3);			//2022-08-08 08:08:08

        instance.add(Calendar.MONTH, 2);
        d2 = instance.getTime();
        String str4 = sdf.format(d2);
        System.out.println("增加后的日期为: " + str4);			// 2022-10-08 08:08:08

	}
}