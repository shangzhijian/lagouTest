package S1.M4.T2;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamTest {

    public static void main(String[] args) {
        DataInputStream dis = null;

        try {
            // 1.创建DataInputStream类型的对象与/Users/shangzhijian/Desktop/lagouTest/a.txt文件关联
            //dis = new DataInputStream(new FileInputStream("/Users/shangzhijian/Desktop/lagouTest/B.txt"));
            dis = new DataInputStream(new FileInputStream("F:/B.txt"));
            // 2.从输入流中读取一个整数并打印
            int i = dis.read();
            System.out.println("读取的整数是：" + i);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 3.关闭流对象并释放有关的资源
            try {
                dis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
