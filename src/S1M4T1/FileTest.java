package S1M4T1;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest {

    public static void show(File file) {
        // 获取参数指定目录下的所有内容并记录到一维数组中
        File[] fileArray = file.listFiles();

        //遍历数组
        for (File f : fileArray) {
            String name = f.getName();
            //判断文件，打印文件名
            if (f.isFile()) System.out.println(name);
            //判断目录，打印目录名，用[]扩起来，并进入子目录
            if (f.isDirectory()) {
                System.out.println("[" + name + "]");
                show(f);
            }
        }
    }

    public static void main(String[] args) throws IOException {

        // 1.构造File类型的对象与d:/a.txt文件关联
        //File f1 = new File("/Users/shangzhijian/Desktop/lagouTest/a.txt");
        File f1 = new File("F:/a.txt");
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
        File f2 = new File("F:/第一层/第二层/第三层/第四层");
        if (f2.exists()) {
            System.out.println("目录名称是：" + f2.getName());
            System.out.println("目录名称是：" + f2.getAbsolutePath());
            System.out.println(f2.delete() ? "删除成功" : "删除失败");
        } else {
            System.out.println(f2.mkdirs() ? "目录创建成功" : "目录创建失败");
        }

        System.out.println("---------------------------------------------------------");
        // 5.实现将指定目录中的所有内容打印出来
        File f3 = new File("F:/第一层");
        // 获取目录f3下的所有内容并记录到一维数组中
        File[] farr = f3.listFiles();
        // 遍历数组
        for (File f : farr) {
            String name = f.getName();
            // 判断是否为文件，若是则直接打印文件名称
            if (f.isFile()) {
                System.out.println(name);
            }
            // 若是目录，则使用[]将目录名称括起来
            if (f.isDirectory()) {
                System.out.println("[" + name + "]");
            }
        }

        System.out.println("---------------------------------------------------------");
        // 6.实现目录中所有内容获取的同时进行过滤
        //匿名内部类 接口/父类类型 引用变量名 = new 接口/父类类型（）{方法体}
        /*FileFilter ff = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                // 若文件名是以.avi为结尾，则返回true表示保留   否则返回false就是表示丢弃
                return pathname.getName().endsWith(".avi");
            }
        };*/

        //Lambda表达式 接口/父类类型 = （参数列表） -> {方法体}
        FileFilter ff = (File pathName) -> {return pathName.getName().endsWith(".avi");};

        File[] listFiles = f3.listFiles(ff);
        for (File f : listFiles) {
            System.out.println(f);              //File对象存放绝对路径？
            System.out.println(f.getName());    //getName存放最后一层的文件名
        }

        System.out.println("---------------------------------------------------------");
        // 7.使用递归的思想获取目录以及子目录中的内容
        show(new File("F:/第一层"));
    }
}
