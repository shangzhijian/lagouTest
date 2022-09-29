package S1.M3.T3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class DateTimeFormatterTest {

    public static void main(String[] args) {

        // 1.获取当前系统的日期时间并打印
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("获取到的时间为： " + localDateTime);

        // 2.按照指定的格式准备一个DateTimeFormatter类型的对象
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // 3.实现日期时间向字符串类型的转换并打印
        String str = dtf.format(localDateTime);
        System.out.println("转换为字符串后的日期是：" + str);

        // 4.实现字符串类型到日期时间类型的转换并打印
        TemporalAccessor parse = dtf.parse(str);
        System.out.println("转回去的结果是： " + parse);
    }
}
