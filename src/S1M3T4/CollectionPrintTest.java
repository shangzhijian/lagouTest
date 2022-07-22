package S1M3T4;

import java.util.*;

public class CollectionPrintTest {

    public static void main(String[] args) {

        // 1.准备一个Collection集合并放入元素后打印
        List c1 = new ArrayList();
        c1.add("one");
        c1.add(2);
        c1.add(new Person("zhangfei", 30));
        // 遍历方式一： 自动调用toString方法   String类型的整体
        System.out.println("c1 = " + c1);   // [one, 2, Person{name='zhangfei', age=30}]

        System.out.println("------------------------------------------------");
        // 2.遍历方式二：使用迭代器来遍历集合中的所有元素  更加灵活
        Iterator iterator1 = c1.iterator();
        while(iterator1.hasNext()) {
            System.out.println("获取的元素有：" + iterator1.next());
        }

        System.out.println("------------------------------------------------");
        // 由于上个循环已经使得迭代器走到了最后，因此需要重置迭代器
        iterator1 = c1.iterator();
        // 3.使用迭代器来模拟toString方法的打印效果
        StringBuilder sb1 = new StringBuilder();
        sb1.append("[");
        while (iterator1.hasNext()) {
            Object obj = iterator1.next();
            //最后一个元素拼接元素和[
            if(!iterator1.hasNext()) {              //hasNext会随next的移动而移动
                sb1.append(obj).append("]");
            }else {
                //否则拼接元素，逗号和空格
                sb1.append(obj).append(",").append(" ");
            }
        }
        // [one, 2, Person{name='zhangfei', age=30}]
        System.out.println("拼接后的元素有：" + sb1);

        System.out.println("------------------------------------------------");
        // 4.不断地去获取集合中的元素并判断，当元素值为"one"时则删除该元素
        c1.add(2,"one");
        System.out.println("c1 = " + c1); //[one, 2, one, Person{name='zhangfei', age=30}]
        iterator1 = c1.iterator();
        while (iterator1.hasNext()) {
            Object obj = iterator1.next();
            if ("one".equals(obj)) iterator1.remove();//使用迭代器的remove方法删除元素没问题
            //c1.remove(obj); // 使用集合的remove方法编译ok，运行发生ConcurrentModificationException并发修改异常
        }
        System.out.println("删除one后的集合为：" + c1);

        System.out.println("------------------------------------------------");
        // 5.使用 for each结构实现集合和数组中元素的遍历  代码简单且方法灵活
        // 由调试源码可知：该方式确实是迭代器的简化版
        for (Object obj:
             c1) {
            System.out.println("取出的元素是：" + obj);
        }

        int[] arr = new int[]{11, 22, 33, 44, 55};
        for (int i :
                arr) {
            System.out.println("取出的元素为：" + i);
            i = 66; // 修改局部变量i的数值，并不是修改数组中元素的数值
        }
        System.out.println("数组中的元素有：" + Arrays.toString(arr));


    }
}
