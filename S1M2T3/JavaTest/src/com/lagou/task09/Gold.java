package com.lagou.task09;

public class Gold  implements Metal , Money{


    @Override
    public void shine() {
        System.out.println("发出了光芒！！！");
    }

    @Override
    public void buy() {
        System.out.println("购物ing！");
    }

    public static void main(String[] args) {

        //1.声明接口类型的引用指向实现类的对象，形成了多态
        Metal m = new Gold();
        m.shine();

        Money mon = new Gold();
        mon.buy();
    }
}
