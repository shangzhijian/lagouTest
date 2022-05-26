package com.lagou.task09;

public class FixedAccount extends Account {

    public FixedAccount(int i) {
        super(i);
    }

    @Override
    public double getLixi(){
        return getMoney() * 0.03 * 1;
    }

    public static void main(String[] args) {

        Account a = new FixedAccount(1000);
        System.out.println("利息是：" + a.getLixi());
    }
}
