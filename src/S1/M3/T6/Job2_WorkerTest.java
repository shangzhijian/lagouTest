package S1.M3.T6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Job2_WorkerTest {

    public static void main(String[] args) {

        //定义List集合，在List集合中增加三个员工，基本信息如下：  "凤姐" 18 20000  "欧阳峰" 60 8000  "刘德华" 40 30000
        List<Job2_Worker> l1 = new ArrayList<>();
        l1.add(new Job2_Worker("凤姐", 18 , 20000));
        l1.add(new Job2_Worker("欧阳锋", 60, 8000));
        l1.add(new Job2_Worker("刘德华", 40, 30000));


        //在"欧阳峰"之前插入一个员工，信息为：姓名："张柏芝"，年龄：35，工资3300
        l1.add(1,new Job2_Worker("张柏芝", 35, 3300));

        //删除"刘德华"的信息
        l1.remove(3);

        //利用for 循环遍历，打印List 中所有员工的信息
        for (Job2_Worker jw :
                l1) {
            System.out.println(jw);
        }

        System.out.println("-------------------------------------");
        //利用迭代遍历，对List 中所有的员工调用work 方法
        Iterator<Job2_Worker> iterator = l1.iterator();
        while(iterator.hasNext()) {
            iterator.next().work();
        }

        System.out.println("-------------------------------------");
        //为Worker类重写equals 方法，当姓名、年龄、工资全部相等时候才返回true
        System.out.println(l1);
        l1.add(new Job2_Worker("欧阳锋", 60, 8000));
        Job2_Worker jw1 = l1.get(2);
        System.out.println(jw1);
        Job2_Worker jw2 = l1.get(3);
        System.out.println(jw2);
        System.out.println(jw1.equals(jw2));
    }
}
