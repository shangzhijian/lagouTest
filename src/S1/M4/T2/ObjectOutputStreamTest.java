package S1.M4.T2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamTest {

    public static void main(String[] args) {
        ObjectOutputStream oos = null;

        try {
            // 1.创建ObjectOutputStream类型的对象与文件/Users/shangzhijian/Desktop/lagouTest/a.txt关联
            oos = new ObjectOutputStream(new FileOutputStream("/Users/shangzhijian/Desktop/lagouTest/a.txt"));
            // 2.准备一个User类型的对象并初始化
            User u = new User("zhangfei", "123", "111");
            // 3.将整个User类型的对象写入输出流
            oos.writeObject(u);

            System.out.println("对象写入成功！");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4.关闭流对象并释放有关的资源
            if (null != oos) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
