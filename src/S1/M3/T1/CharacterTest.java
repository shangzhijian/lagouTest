package S1.M3.T1;

public class CharacterTest {

    public static void main(String[] args) {
        // 1.在Java5之前调用方法实现装箱和拆箱机制
        // 相当于从char类型到Character类型的转换，装箱
        Character ch1 = new Character('a');
        Character ch2 = Character.valueOf('a');
        System.out.println("ch1 = " + ch1 + ", ch2 = " + ch2);
        // 从Character类型向char类型的转换，拆箱
        char c1 = ch1.charValue();
        char c2 = ch2.charValue();
        System.out.println("c1 = " + c1 + ", c2 = " + c2);

        System.out.println("----------------------------------------");
        // 2.从Java5开始支持自动装箱和拆箱
        Character ch3 = 'a';
        char c3 = ch3;
        System.out.println("c3 = " + c3);

        System.out.println("----------------------------------------");
        // 3.实现字符类型的判断以及转换
        System.out.println(Character.isUpperCase(c3));
        System.out.println(Character.isLowerCase(c3));
        System.out.println(Character.isDigit(c3));
        System.out.println(Character.toUpperCase(c3));
        System.out.println(Character.toLowerCase(c3));
    }
}
