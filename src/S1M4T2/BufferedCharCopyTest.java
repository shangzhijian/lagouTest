package S1M4T2;

import java.io.*;

public class BufferedCharCopyTest {

    public static void main(String[] args) {

        long g1 = System.currentTimeMillis();

        BufferedReader br = null;
        BufferedWriter bw = null;

        System.out.println("开始拷贝。。。");

        try {
            // 1.创建BufferedReader类型的对象与F:/test.chm文件关联
            br = new BufferedReader(new FileReader("F:/a.txt"));
            // 2.创建BufferedWriter类型的对象与F:/test3.chm文件关联
            bw = new BufferedWriter(new FileWriter("F:/test3.txt"));
            //3.不断的从输入流读取数据内容写入到输出流中
            int res = 0;
            char[] cArr = new char[1034];
            while ((res = br.read(cArr)) != -1) {
                bw.write(cArr, 0, res);
            }

            System.out.println("拷贝成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭流对象释放资源
            if (null != bw) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != br) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        long g2 = System.currentTimeMillis();
        System.out.println("时间差为：" + (g2 - g1));
    }
}
