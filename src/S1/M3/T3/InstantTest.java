package S1.M3.T3;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class InstantTest {

    public static void main(String[] args) {

        // 1.使用Instant类来获取当前系统时间  并不是当前系统的默认时区  本初子午线   差8小时  东八区
        Instant now = Instant.now();
        System.out.println("获取到的当前时间为：" + now);

        // 2.加上时区所差的8个小时
        OffsetDateTime offsetDateTime = now.atOffset(ZoneOffset.ofHours(8));
        System.out.println("偏移后的时间为：" + offsetDateTime);

        System.out.println("--------------------------------------------------------");
        // 3.获取当前调用对象距离标准基准时间的毫秒数
        long l = now.toEpochMilli();
        System.out.println("现在距离基础时间的毫秒数为：" + l);

        // 4.根据参数指定的毫秒数来构造对象
        Instant instant = Instant.ofEpochMilli(l);
        System.out.println("根据参数指定的毫秒数设置的时间为：" + instant);
    }
}
