/*
 Dog类继承Animal类
*/

package S1.M2.T3.JavaTest.src.com.lagou.task08;

public class Dog extends Animal{

    private int tooth;

    public Dog() {}

    public Dog(String name , String color , int tooth) {
        super(name , color);
        setTooth(tooth);
    }

    public int getTooth() {
        return tooth;
    }

    public void setTooth(int tooth) {
        this.tooth = tooth;
    }

    @Override
    public void show(){
        super.show();
        System.out.println("牙齿数量" + getTooth());
        //System.out.println("名字：" + getName() + "，颜色" + getColor() + ",牙齿数量" + getTooth());
    }
}
