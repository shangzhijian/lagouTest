package S1M3T1;

public class DoubleTest {
    public static void main(String[] args) {
        // 1.在Java5之前装箱和拆箱的实现
        // 实现了从double类型到Double类型的转换，装箱
        Double db1 = new Double(3.14);
        Double db2 = Double.valueOf(3.14);
        System.out.println("db1 = " + db1);
        System.out.println("db2 = " + db2);
        // 实现了从Double类型到double类型的转换，拆箱
        double d1 = db1.doubleValue();
        double d2 = db2.doubleValue();
        System.out.println("d1 = " + d1 + ",d2 = " + d2);

        System.out.println("---------------------------------------------");
        // 2.从Java5开始实现自动装箱和自动拆箱
        Double db3 = 13.14;
        double d3 = db3;

        System.out.println("---------------------------------------------");
        // 3.实现静态方法和成员方法的调用
        double d4 = Double.parseDouble("13.14");
        System.out.println("d4 = " + d4);
        System.out.println("db3判断结果是" + db3.isNaN());
        Double db4 = Double.valueOf(0/0.0);
        System.out.println("db4判断的结果是" + db4.isNaN());
    }
}
