package S1M3T5;

import java.util.*;

public class MapTest {

    public static void main(String[] args) {

        // 1.准备一个Map集合并打印
        Map<String, String> m1 = new HashMap<>();
        // 自动调用toString方法，默认打印格式为：{key1=value1, key2=value2, ...}
        System.out.println("m1 = " + m1); // {啥也没有}

        // 2.向集合中添加元素并打印
        String st1 = m1.put("1", "one");
        System.out.println("原来的value值是：" + st1);    //null
        System.out.println("m1 = " + m1);               //{1=one}

        st1 = m1.put("2", "two");
        System.out.println("原来的value值是：" + st1);    //null
        System.out.println("m1 = " + m1);               //{1=one, 2=two}

        st1 = m1.put("3", "three");
        System.out.println("原来的value值是：" + st1);   //null
        System.out.println("m1 = " + m1);               //{1=one, 2=two, 3=three}

        st1 = m1.put("1", "eleven");
        System.out.println("原来的value值是：" + st1);   //one
        System.out.println("m1 = " + m1);               //{1=eleven, 2=two, 3=three}

        System.out.println("-------------------------------------------------------------");
        // 3.实现集合中元素的查找操作
        boolean b1 = m1.containsKey("11");
        System.out.println("b1 = " + b1); // false
        b1 = m1.containsKey("1");
        System.out.println("b1 = " + b1); // true

        b1 = m1.containsValue("1");
        System.out.println("b1 = " + b1); // false
        b1 = m1.containsValue("two");
        System.out.println("b1 = " + b1); // true

        String st2 = m1.get("5");
        System.out.println("key所对应的Value为：" + st2);     //null

        st2 = m1.get("1");
        System.out.println("key所对应的Value为：" + st2);     //eleven

        System.out.println("-------------------------------------------------------------");
        // 4.实现集合中元素的删除操作
        String remove = m1.remove("1");
        System.out.println("删除的元素是：" + remove);     // eleven
        System.out.println("m1 = " + m1);               // {2=two, 3=three}

        System.out.println("-------------------------------------------------------------");
        // 5.获取Map集合中所有的key并组成Set视图
        Set<String> s1 = m1.keySet();
        //遍历所有的key
        System.out.println("s1中的key= " + s1);
        for (String ts : s1) {
            System.out.println(ts + "=" + m1.get(ts));
        }

        System.out.println("-------------------------------------------------------------");
        // 6.获取Map集合中所有的Value并组成Collection视图
        Collection<String> values = m1.values();
        Iterator it = values.iterator();
        while(it.hasNext()) {
            System.out.println("value= " + it.next());
        }

        for (String ms : values) {
            System.out.println("value =" + ms);
        }

        System.out.println("-------------------------------------------------------------");
        // 7.获取Map集合中所有的键值对并组成Set视图
        Set<Map.Entry<String, String>> entries = m1.entrySet();
        for (Map.Entry<String, String> en :
                entries) {
            System.out.println(en);
        }
    }
}
