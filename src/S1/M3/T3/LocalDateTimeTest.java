package S1.M3.T3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest {

    public static void main(String[] args) {

        // 1.获取当前日期信息并打印
        LocalDate now = LocalDate.now();
        System.out.println("获取到的当前日期是：" + now);
        // 2.获取当前时间信息并打印
        LocalTime now1 = LocalTime.now();
        System.out.println("获取到的当前时间是： " + now1);
        // 3.获取当前日期时间信息并打印，使用最多
        LocalDateTime now2 = LocalDateTime.now();
        System.out.println("获取当前的日期时间是： " + now2);

        System.out.println("-------------------------------------------------------");
        // 4.使用参数指定的年月日时分秒信息来获取对象并打印
        //LocalDateTime of1 = LocalDateTime.of(2008, 8, 8, 8, 8, 8);
        LocalDateTime of2 = LocalDateTime.of(2008,8,8,8,8);
        System.out.println("根据参数指定的年月日时分秒获取的日期时间是： " + of2);    //自动调用toString()
        System.out.println("获取到的年是： " + of2.getYear());             //2008
        System.out.println("获取到的月是： " + of2.getMonthValue());       //8
        System.out.println("获取到的日是： " + of2.getDayOfMonth());       //8
        System.out.println("获取到的时是： " + of2.getHour());             //8
        System.out.println("获取到的分是： " + of2.getMinute());           //8
        System.out.println("获取到的秒是： " + of2.getSecond());           //0

        System.out.println("-------------------------------------------------------");
        // 5.实现特征的设置并打印
        // 与String类型相似，调用对象本身的数据内容不会改变，返回值相当于创建了一个新的对象，由此证明了不可变性
        LocalDateTime of3 = of2.withYear(2022);
        System.out.println("设置年份后的值为：" + of3);
        System.out.println("设置年份后的原来的LocalDateTime值为：" + of2);
        LocalDateTime withMonth = of3.withMonth(7);
        System.out.println("设置月份后的值为：" + withMonth);

        System.out.println("-------------------------------------------------------");
        // 6.实现特征的增加并打印
        LocalDateTime localDateTime = withMonth.plusDays(13);
        System.out.println("增加日子后的值为" + localDateTime);     //2022-07-21T08:08
        //System.out.println("增加日子后的原值为" + withMonth);

        System.out.println("-------------------------------------------------------");
        // 7.实现特征的减少并打印
        LocalDateTime localDateTime1 = localDateTime.minusHours(1);
        LocalDateTime localDateTime2 = localDateTime1.minusMinutes(8);
        System.out.println("减少后的时间为现在写代码的时间： " + localDateTime2);//2022 07 21 07 00
    }
}
