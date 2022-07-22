package S1M3T4;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

    public static void main(String[] args) {

        // 1.准备一个Queue集合并打印
        Queue queue = new LinkedList();
        System.out.println("队列中的元素是：" + queue);     //[]

        System.out.println("----------------------------------------------------------");
        // 2.将数据11、22、33、44、55依次入队并打印
        for (int i = 1; i < 6; i++) {
            queue.offer(i * 11);
            System.out.println("队列中元素是" +  queue);
        }

        System.out.println("----------------------------------------------------------");
        // 3.然后查看队首元素并打印
        System.out.println("队首元素是：" + queue.peek());    //11

        System.out.println("----------------------------------------------------------");
        // 4.然后将队列中所有数据依次出队并打印
        int len = queue.size();
        for (int i = 0; i < len; i++) {
            Object poll = queue.poll();
            System.out.println("出队元素是  " + poll);
        }

        System.out.println("----------------------------------------------------------");
        // 5.查看队列中最终的元素
        System.out.println("最终队列中的元素为：" + queue);
    }
}
