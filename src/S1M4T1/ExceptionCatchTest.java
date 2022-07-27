package S1M4T1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionCatchTest {

    public static void main(String[] args) {

        // 创建一个FileInputStream类型的对象与d:/a.txt文件关联，打开文件
        FileInputStream fis = null;
        try {
            System.out.println("1");
            fis = new FileInputStream("/Users/shangzhijian/Desktop/lagouTest/a.txt");
            System.out.println("2");
        } catch (FileNotFoundException e) {
            System.out.println("3");
            e.printStackTrace();
            System.out.println("4");
        }

        try {
            System.out.println("5");
            fis.close();
            System.out.println("6");
        } /*catch (IOException e) {
            System.out.println("7");
            e.printStackTrace();
            System.out.println("8");
        } catch (NullPointerException e) {
            System.out.println("9");
            e.printStackTrace();
            System.out.println("10");
        }*/
        catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println("世界上。。。");
        // 当程序执行过程中没有发生异常时的执行流程：1 2  5 6  世界上...
        // 当程序执行过程中发生异常又没有手动处理空指针异常时的执行流程：1 3 4  5  空指针异常导致程序终止
        // 当程序执行过程中发生异常并且手动处理空指针异常时的执行流程： 1 3 4 5 世界上...

        // 手动处理异常和没有处理的区别：代码是否可以继续向下执行

    }
}
