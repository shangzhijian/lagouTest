package S1M3T3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {

	public static void main(String[] args) throws Exception{

		// 1.获取当前系统时间并打印
		// SimpleDateFormat sdf = new SimpleDateFormat();
		//java.text.SimpleDateFormat@ca92313f说明SimpleDateFormat没有重写toString方法
		// System.out.println("sdf = " + sdf);		
		Date d1 = new Date();
		System.out.println("d1 = " + d1);

		 // 2.构造SimpleDateFormat类型的对象并指定格式
		SimpleDateFormat sdf = new SimpleDateFormat("y-M-d H:m:s");
		// 3.实现日期类型向文本类型的转换并打印
		String str1 = sdf.format(d1);
		System.out.println("转换后的日期为：" + str1);
		// 4.实现文本类型到日期类型的转换并打印
		Date d2 = sdf.parse("2008-08-08 20:08:08");
		System.out.println("转化为日期格式为： " + d2);
	}
}