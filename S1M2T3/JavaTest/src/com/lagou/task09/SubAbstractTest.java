package com.lagou.task09;

public class SubAbstractTest extends AbstractTest{

    @Override
    public void show() {
        System.out.println("被迫重写！");
    }

    public static void main(String[] args) {
        SubAbstractTest sat = new SubAbstractTest();
        sat.show();

        System.out.println("-------------------");
        //父类抽象类引用指向子类对象
        AbstractTest at = new SubAbstractTest();
        at.show();
    }


}
