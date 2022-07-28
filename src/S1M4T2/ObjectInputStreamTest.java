package S1M4T2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamTest {

    public static void main(String[] args) {
        ObjectInputStream ois = null;
        try {
            // 1.创建ObjectInputStream类型的对象与/Users/shangzhijian/Desktop/lagouTest/a.txt文件关联
            ois = new ObjectInputStream(new FileInputStream("/Users/shangzhijian/Desktop/lagouTest/a.txt"));
            // 2.从输入流中读取一个对象并打印
            Object obj = ois.readObject();
            System.out.println("获取的对象是：" + obj);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            // 3.关闭流对象并释放有关的资源
            if (null != ois) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }


}
