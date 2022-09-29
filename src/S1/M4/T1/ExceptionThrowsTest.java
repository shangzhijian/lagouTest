package S1.M4.T1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionThrowsTest {

    public static void show() throws IOException {
        FileInputStream fis = new FileInputStream("/Users/shangzhijian/Desktop/lagouTest/a.txt");
        System.out.println("是否继续往下执行？");
        fis.close();
    }

    public static void show2() throws IOException {
        show();
    }

    public static void show3() throws IOException {
        show2();
    }

    // 不建议在main方法中抛出异常   JVM负担很重
    public static void main(String[] args) {

        try {
            show();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("------------------");

        try {
            show3();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
