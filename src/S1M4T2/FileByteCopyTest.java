package S1M4T2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteCopyTest {

    public static void main(String[] args) {

        //获取当前系统时间距离1970年1月1日0时0分0秒的毫秒数
        long g = System.currentTimeMillis();

        FileInputStream fis = null;
        FileOutputStream fos= null;

        try {
            //1.FileInputStream类型对象与文件F:/b.txt关联
            fis = new FileInputStream("F:/b.txt");
            //2.创建FileOutputStream类型对象与文件F:/c.txt关联
            fos = new FileOutputStream("F:/c.txt");
            //3.不断从输入流中读取数据内容写入输出流
            /*
            // 方式一：以单个字节为单位进行拷贝，也就是每次读取一个字节后再写入一个字节
            // 缺点：文件稍大时，拷贝的效率很低
            int res = 0;
            while((res = fis.read()) != -1) {
                fos.write(res);
            }
            */
            /*
            // 方式二：准备一个和文件大小一样的缓冲区，一次性将文件中的所有内容取出到缓冲区然后一次性写入进去
            // 缺点：若文件过大时，无法申请和文件大小一样的缓冲区，真实物理内存不足
            int len = fis.available();
            System.out.println("文件大小是：" + len);
            byte[] bArr = new byte[len];
            int res = fis.read(bArr);
            System.out.println("实际读取的大小是：" + res);
            fos.write(bArr);
            */

            // 方式三：准备一个相对适当的缓冲区，分多次将文件拷贝完成
            byte[] bArr = new byte[1024];
            int res = 0;
            while((res = fis.read(bArr)) != -1){
                //因为read返回的是读取的字节数，所以可以当数组偏移量实现精确复制，-1时就读到末尾了
                fos.write(bArr,0,res);
            }

            System.out.println("文件拷贝成功！");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭流对象释放资源
            if (null != fos) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                }
            }
            if (null != fis) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                }
            }
        }

        long g2 = System.currentTimeMillis();
        System.out.println("程序执行的时间差" + (g2-g));
    }
}
