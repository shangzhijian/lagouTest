package S1.M3.T4;

import java.util.LinkedList;
import java.util.List;

public class ListMethodTest {

    public static void main(String[] args) {

        // 1.准备一个List集合并打印
        List lt1 = new LinkedList();
        System.out.println("lt1 = " + lt1); //[]

        System.out.println("------------------------------------------");
        // 2.向集合中添加元素并打印
        // 向集合中的开头位置添加元素
        lt1.add(0,"one");
        // 向集合末尾位置添加元素
        lt1.add(1,3);
        System.out.println("lt1 = " + lt1); // [one, 3]
        // 向集合中的中间位置添加元素
        lt1.add(1,"two");
        System.out.println("lt1 = " + lt1); // [one, two, 3]

        System.out.println("------------------------------------------");
        // 3.根据参数指定的下标来获取元素
        String st1 = (String) lt1.get(1);
        System.out.println("st1 = " + st1);

        // 注意：获取元素并进行强制类型转换时一定要慎重，因为容易发生类型转换异常
        //String str2 = (String)lt1.get(2); // 编译ok，运行发生ClassCastException类型转换异常
        //System.out.println("获取到的元素是：" + str2); // 3

        System.out.println("------------------------------------------");
        // 4.使用get方法获取集合中的所有元素并打印
        StringBuilder sb1 = new StringBuilder("[");
        //System.out.println("sb1 = " + sb1);
        for (int i = 0; i < lt1.size(); i++) {

            //当是最后一个元素时，拼接元素和[
            if ( i == lt1.size()-1) {
                sb1.append(lt1.get(i)).append("]");
            }
            // 否则拼接元素和逗号，和空格
            else {
                sb1.append(lt1.get(i)).append(", ");
            }
        }
        System.out.println("sb1 = " + sb1);     // [one, two, 3]

        System.out.println("------------------------------------------");
        // 5.查找指定元素出现的索引位置
        System.out.println("one第一次出现的位置为：" + lt1.indexOf("one"));
        lt1.add("one");
        System.out.println("one最后一次出现的位置为：" + lt1.lastIndexOf("one"));

        System.out.println("------------------------------------------");
        System.out.println("lt1 = " + lt1); // [one, two, 3, one]
        // 6.实现集合中元素的修改
        Integer it1 = (Integer) lt1.set(2, "three");
        System.out.println("被修改的元素是：" + it1); // 3
        System.out.println("修改后集合中的元素有：" + lt1); // [one, two, three, one]

        String str2 = (String) lt1.set(3,"four");
        System.out.println("被修改的元素是：" + str2); // one
        System.out.println("修改后集合中的元素有：" + lt1); // [one, two, three, four]

        System.out.println("------------------------------------------");
        // 7.使用remove方法将集合中的所有元素删除
        //for(int i = 0 ; i < lt1.size() ; i++) {       //没有删完，因为lt1.size()在变化
        /*for (int i = lt1.size(); i > 0 ; i--) {
            Object remove = lt1.remove(0);
            System.out.println("移出的元素是：" + remove);
            System.out.println("移出后的集合为：" + lt1);
        }*/

        System.out.println("------------------------------------------");
        // 8.获取当前集合中的子集合，也就是将集合中的一部分内容获取出来，子集合和当前集合共用同一块内存空间
        // 表示获取当前集合lt1中下标从1开始到3之间的元素，包含1但不包含3
        List lt2 = lt1.subList(1,3);
        System.out.println("lt2 = " + lt2); //// [two, three]
        // 删除lt2中元素的数值
        str2 = (String) lt2.remove(0);
        System.out.println("被删除的元素是：" + str2); // two
        System.out.println("删除后lt2 = " + lt2); // [three]
        System.out.println("删除后lt1 = " + lt1); // [one, three, four]
    }
}
