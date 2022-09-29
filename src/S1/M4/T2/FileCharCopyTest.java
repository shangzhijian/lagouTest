package S1.M4.T2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharCopyTest {

    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;

        try {
            //1.创建FileReader类型的对象与文件F:/a.txt关联
            fr = new FileReader("F:/a.txt");
            //2.创建FileWriter类型的对象与文件F:/b.txt关联
            fw = new FileWriter("F:/b.txt");
            //3.不断的从输入流中读取数据内容存入输出流中
            int res = 0;
            while((res = fr.read()) != -1) {
                fw.write(res);
            }
            System.out.println("文件拷贝成功！！！");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭流对象并释放资源
            if (null != fw) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != fr) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
