package S1M3T5;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {

    public static void main(String[] args) {

        // 1.准备一个集合并初始化
        List<Integer> lt1 = Arrays.asList(11, 22, 33, 44, 55);
        // 2.实现集合中元素的各种操作
        System.out.println("集合中的最大值是：" + Collections.max(lt1)); //55
        System.out.println("集合中的最小值是：" + Collections.min(lt1)); //11

        // 实现集合中元素的反转
        Collections.reverse(lt1);
        System.out.println("反转后集合lt1 = " + lt1);        //[55, 44, 33, 22, 11]

        // 实现两个元素的交换
        Collections.swap(lt1, 0, 4);
        System.out.println("交换下标为0和4的元素：" + lt1);   //[11, 44, 33, 22, 55]
        // 实现元素的排序
        Collections.sort(lt1);
        System.out.println("排序后的集合为:" + lt1);       //[11, 22, 33, 44, 55]
        // 随机置换
        Collections.shuffle(lt1);
        System.out.println("随机置换后" + lt1);    //随机

        // 实现集合间元素的拷贝
        //List<Integer> lt2 = new ArrayList<>(20);      //规定了容量，没设置大小,使用copy：IndexOutOfBoundsException
        List<Integer> lt2 = Arrays.asList(new Integer[10]);     //设置了大小为10的数组
        System.out.println("lt1的大小是：" + lt1.size());
        System.out.println("lt2的大小是：" + lt2.size());
        // 表示将lt1中的元素拷贝到lt2中
        Collections.copy(lt2,lt1);
        System.out.println("lt2 = " + lt2);
    }
}
