/*
	编程实现Point类
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


	public static void main(String[] args){
		Point p = new Point();

		p.show();

		Point p1= new Point(1,2);
		p1.show();
	}
}