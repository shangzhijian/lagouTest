package S1M4T2;

import java.io.*;

public class BufferedByteCopyTest {

    public static void main(String[] args) {

        // 获取当前系统时间距离1970年1月1日0时0分0秒的毫秒数
        long g1 = System.currentTimeMillis();

        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            // 1.创建BufferedInputStream类型的对象与F:/test.chm文件关联
            bis = new BufferedInputStream(new FileInputStream("F:/test.chm"));
            // 2.创建BufferedOutputStream类型的对象与F:/test.chm文件关联
            bos = new BufferedOutputStream(new FileOutputStream("F:/test2.chm"));

            //3.不断的从输入流读取数据内容写入到输出流中
            System.out.println("开始拷贝...");

            byte[] bArr = new byte[1024];
            int res = 0;
            while((res = bis.read(bArr)) != -1) {
                bos.write(bArr, 0, res);
            }
            System.out.println("文件拷贝成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭流对象释放资源
            if (null != bos){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != bis) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        long g2 = System.currentTimeMillis();
        System.out.println("使用缓冲区拷贝视频文件消耗的时间为：" + (g2-g1)); // 80

    }
}
