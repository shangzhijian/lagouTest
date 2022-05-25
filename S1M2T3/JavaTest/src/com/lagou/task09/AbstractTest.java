package com.lagou.task09;

public abstract class AbstractTest {

    private double cnt;

    public AbstractTest() {}

    public AbstractTest(int cnt) {
        setCnt(cnt);
    }

    public double getCnt() {
        return cnt;
    }

    public void setCnt(double cnt) {
        this.cnt = cnt;
    }

    public abstract void show();

/*    public static void main(String[] args) {
        AbstractTest at = new AbstractTest();
        System.out.println("at.cnt = " + at.getCnt());
    }*/
}
