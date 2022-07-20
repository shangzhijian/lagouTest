package S1M2T3;/*
	编程实现worker类的测试
 */

public class WorkerTest {

	public static void main(String[] args) {

		//1.无参构造
		Worker w1 = new Worker();
		w1.show();

		System.out.println("-------------------");
		//2.有参构造
		Worker w2 = new Worker(18 , "aj_shang" , 10000);
		w2.show();

		System.out.println("-------------------");

		//3.调用worker成员方法
		w1.eat("香蕉");
		w2.play("王者荣耀");
		w2.work();

	}
}