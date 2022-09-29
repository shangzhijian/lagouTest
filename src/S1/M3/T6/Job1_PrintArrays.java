package S1.M3.T6;

public class Job1_PrintArrays {

    public static String toString(int[] arr) {

        //如果int类型数组arr为null，toString方法返回字符串"null"
        if (null == arr) return "null";
        //如果int类型数组arr长度为0，toString方法返回字符串"[]"
        if(0 == arr.length) return "[]";

        //如果int类型数组arr的内容为{1,2,3,4,5},toString方法返回字符串"[1, 2, 3, 4, 5]"
        StringBuilder sb1 = new StringBuilder();
        sb1.append("[");
        for (int i = 0; i < arr.length; i++) {
            //当取到最后一个元素时，拼接元素 和 ]
            if (i == arr.length - 1) sb1.append(arr[i]).append("]");
            else { //否则拼接元素和逗号和空格
                sb1.append(arr[i]).append(",").append(" ");
            }
        }
        String s = "" + sb1;
        return s;
    }
}
