package S1M2T2;/*
	编程实现Point类添加重载的成员方法：
		up()一实现纵坐标减1的功能。
		up(int dy)一实现纵坐标减去参数指定数值的功能。
	测试重载方法的调用规则
 */

public class Point{


	//存放横纵 坐标
	int x;
	int y;

	Point(){}//无参构造

	Point(int x, int y){
		this.x = x;
		this.y = y;
	}

	void show(){
		System.out.println("横坐标是：" + x + "纵坐标是：" + y);
	}

	void up(){
		y--;
	}

	void up(int dy){
		y -= dy;
	}




	public static void main(String[] args){
		Point p = new Point();

		p.show();

		Point p1= new Point(4,5);
		p1.show();

		p1.up();
		p1.show();

		p1.up(3);
		p1.show();
	}
}