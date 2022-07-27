package S1M4T1;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest {

    public static void main(String[] args) throws IOException {

        // 1.构造File类型的对象与d:/a.txt文件关联
        File f1 = new File("/Users/shangzhijian/Desktop/lagouTest/a.txt");
        // 2.若文件存在则获取文件的相关特征信息并打印后删除文件
        if (f1.exists()) {
            System.out.println("文件名是：" + f1.getName());
            System.out.println("文件大小：" + f1.length());
            Date d1 = new Date(f1.lastModified());
            SimpleDateFormat sdf = new SimpleDateFormat("y-M-d H-m-s");
            System.out.println("最后一次修改时间为：" + sdf.format(d1));
            System.out.println("文件的绝对路径：" + f1.getAbsolutePath());
        } else {
            System.out.println(f1.createNewFile() ? "文件创建成功": "文件创建失败");
        }

        System.out.println("---------------------------------------------------------");
        // 4.实现目录的删除和创建

    }
}
