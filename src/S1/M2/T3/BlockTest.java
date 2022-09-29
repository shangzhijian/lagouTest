package S1.M2.T3;/*
	编程实现构造块和静态代码块的使用
 */

public class BlockTest {

	{
		System.out.println("构造块");
	}
	static {
		System.out.println("静态代码块");
	}

	public BlockTest() {
		System.out.println("构造方法");
	}

	public static void main(String[] args) {

		BlockTest bt = new BlockTest();

		BlockTest bt2 = new BlockTest();
	}
}