/*
 编程实现Shape类的封装，特征有：横纵坐标 ，要求提供打印所有特征的方法。
*/

package com.lagou.task09;

public class Shape {

    private int x;
    private int y;

    public Shape(){}

    public Shape(int x , int y){
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void show() {
        System.out.println("横坐标是" + getX() + ",纵坐标是" + getY());
    }


}
