package S1M4T1;

public class ExceptionFinallyTest {

    public static int test() {
        try {
            int[] arr = new int[5];
            System.out.println(arr[5]);
            return 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            return 1;
        } finally {
            return 2;
        }
    }

    public static void main(String[] args) {

        try {
            int ia = 10 ;
            int ib = 0;
            System.out.println(ia / ib);
        } catch(ArithmeticException e){
            e.printStackTrace();
            /*String str = null;
            str.length();*/
        } finally {
            System.out.println("无论是否发生异常都记得来执行我哦！");  // 依然是执行
        }

        System.out.println("Over！");//不执行了

        System.out.println("笔试题--------------");
        int test = test();//2
        System.out.println("test =" + test);
    }
}
