package S1M3T6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Job3_StudentMapTest {

    public static void main(String[] args) {

        //定义Map集合，用Student对象作为key，用字符串(此表示表示学生的住址)作为value
        Map<Job3_Student, String> m1 = new HashMap<>();
        m1.put(new Job3_Student("zhangfei", 30), "河南");
        m1.put(new Job3_Student("guanyu", 20), "北京");
        m1.put(new Job3_Student("liubei", 40), "上海");

        System.out.println("--------------------------------------------");
        //利用四种方式遍历Map集合中的内容，格式：key::value

        //方式一：Map转化为String,分隔成String数组，进行每个 = 的替换
        String s = m1.toString();
        String[] sp = s.split(", ");
        for (String str : sp) {
            //获取最后一个=，并进行替换
            StringBuilder sb = new StringBuilder(str);
            int i = sb.lastIndexOf("=");
            sb.replace(i,i+1,"::");
            System.out.println(sb);
        }

        System.out.println("--------------------------------------------");
        //方式一：foreach循环通过每个KeySet获得相应值
        Set<Job3_Student> keySet = m1.keySet();
        for (Job3_Student jw:keySet){
            System.out.println(jw + "::" + m1.get(jw));
        }

        System.out.println("--------------------------------------------");
        //方式二：entryset + foreach
        Set<Map.Entry<Job3_Student, String>> entrySet = m1.entrySet();
        for (Map.Entry<Job3_Student, String> me : entrySet){

            //转化为StringBuilder获取最后一个=位置，并进行替换
            String s1 = me.toString();
            StringBuilder sb = new StringBuilder(s1);
            int i = sb.lastIndexOf("=");
            sb.replace(i,i+1,"::");
            System.out.println(sb);
        }

        System.out.println("--------------------------------------------");
        //方式三：entryset转化为set使用迭代器
        Iterator<Map.Entry<Job3_Student, String>> iterator = entrySet.iterator();
        while(iterator.hasNext()) {

            //转化为StringBuilder获取最后一个=位置，并进行替换
            String s1 = iterator.next().toString();
            StringBuilder sb = new StringBuilder(s1);
            int i = sb.lastIndexOf("=");
            sb.replace(i,i+1,"::");
            System.out.println(sb);
        }
    }
}
