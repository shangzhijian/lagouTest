package S1M4T1;

import java.io.IOException;

public class ExceptionPreventTest {

    public static void main(String[] args) {

        //算数异常  ArithmeticException
        int ia = 5;
        int ib = 0;
        if (0 != ib) {
            System.out.println(5 / ib);
        }

        //数组下标越界异常  ArrayIndexOutofBoundsException
        int[] arr = new int[5];
        int pos = 5;
        if (pos >= 0 && pos < 5) {
            System.out.println(arr[5]);
        }

        //发生空指针异常   NullPointerException
        String str = null;
        if (null != str) {
            int length = str.length();
            System.out.println(length);
        }

        //类型转换异常    ClassCastException
        Exception ex = new Exception();
        if (ex instanceof IOException) {
            IOException io = (IOException) ex;
        }

        //数字格式异常    NumberFormatException
        str = "123a";
        if ( str.matches("[0-9]+")){
            System.out.println(Integer.parseInt(str));
        }

        System.out.println("程序正常结束！");
    }
}
