package S1.M4.T2;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintStreamChatTest {

   /* public static void main(String[] args) {
        BufferedReader br = null;
        PrintStream ps = null;

        try {
            // 由手册可知：构造方法需要的是Reader类型的引用，但Reader类是个抽象类，实参只能传递子类的对象  字符流
            // 由手册可知： System.in代表键盘输入， 而且是InputStream类型的 字节流
            br = new BufferedReader(new InputStreamReader(System.in));
            ps = new PrintStream(new FileOutputStream("/Users/shangzhijian/Desktop/lagouTest/a.txt"),true);

            boolean flag = true;

            // 1.提示用户输入要发送的聊天内容并使用变量记录
            while (true) {
                // 2.判断用户输入的内容是否为"bye"，若是则聊天结束
                System.out.println(flag ? "A说：" : "B说：");
                String str = br.readLine();
                if("bye".equals(str)) {
                    System.out.println("聊天结束");
                    break;
                }
                // 3.若不是则将用户输入的内容写入到文件d:/a.txt中;/Users/shangzhijian/Desktop/lagouTest/a.txt"
                else {
                    Date d1 = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
                    String time = sdf.format(d1);
                    ps.println(time + (flag ? " A说：" : " B说：") + str);
                }
                flag = !flag;
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4.关闭流对象并释放有关的资源
            if (null != ps) {
                ps.close();
            }
            if (null != br) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }*/

    public static void main(String[] args) {

        BufferedReader br = null;
        PrintStream ps  = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            ps = new PrintStream(new FileOutputStream("/Users/shangzhijian/Desktop/lagouTest/a.txt"),true);

            boolean flag = true;
            while(true) {
                //1.提示用户输入内容，并使用变量存储
                System.out.println(flag ?  "A说：" : "B说：");
                String str = br.readLine();
                //记录说话时间
                Date d1 = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
                String time = sdf.format(d1);

                //2.判断用户发送的是bye否，是就打印到路径文件中，
                if ("bye".equals(str)) {
                    System.out.println("聊天结束");
                    break;
                }
                //3.否则结束聊天
                else {
                    ps.println(time + (flag ?  " A说：" : " B说：") + str);
                }
                //flag取反实现两人聊天的效果
                flag = !flag;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭流对象释放资源
            if (null != ps) {
                try {
                    ps.close();
                } catch (Exception e) {
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

    }
}
