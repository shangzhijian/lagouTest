package S1M3T4;

import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {

        // 1.准备一个Stack类型的对象并打印
        Stack s1 = new Stack();
        Stack s2 = new Stack();
        System.out.println("s1 = " + s1);

        System.out.println("-----------------------------------------------");
        // 2.将数据11、22、33、44、55依次入栈并打印
        for (int i = 1; i <= 5; i++) {
            s1.push(i*11);
            System.out.println("s1 = " + s1);
        }

        System.out.println("-----------------------------------------------");
        // 3.查看栈顶元素值并打印
        Object peek = s1.peek();
        System.out.println("peek = " + peek);

        System.out.println("-----------------------------------------------");
        // 4.对栈中所有元素依次出栈并打印
        for (int i = s1.size(); i > 0 ; i--) {
            Integer pop = (Integer) s1.pop();
            System.out.println("出站元素是：" + pop);
        }
        System.out.println("全部出站后集合为：" + s1);

        System.out.println("-----------------------------------------------");
        // 5.经过两个栈，打印出站元素
        for (int i = 1; i <= 5; i++) {
            s1.push(i*11);
            System.out.println("s1 = " + s1);
        }

        for (int i = s1.size(); i > 0 ; i--) {
            Integer pop = (Integer) s1.pop();
            s2.push(pop);
        }
        System.out.println("s2 = " + s2);

        for (int i = 0; i < 5; i++) {
            Object pop = s2.pop();
            System.out.println("出栈元素是 " + pop);
        }

        System.out.println("最终s1 = " + s1);
        System.out.println("最终s2 = " + s2);
    }
}
