package S1.M3.T6;

public class Job1_PrintArraysTest {

    public static void main(String[] args) {

        int[] arr = null;
        String s = Job1_PrintArrays.toString(arr);
        System.out.println(s);

        System.out.println("-------------------------");
        int[] arr1 = new int[0];
        s = Job1_PrintArrays.toString(arr1);
        System.out.println(s);

        System.out.println("-------------------------");
        int[] arr2 = new int[]{11, 22, 33, 44, 55};
        s = Job1_PrintArrays.toString(arr2);
        System.out.println(s);


    }
}
