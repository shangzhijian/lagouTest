package S1M4T1;

public class ExceptionTest {

    public static void main(String[] args) {

        // 1.见识一下非检测性异常  运行时异常
        System.out.println(5 / 0);// 编译ok，运行阶段会发生算术异常  下面的代码不会执行

        //2.检测性异常
        //Thread.sleep(1000);

        System.out.println("程序正常结束了！！！");
    }
}


