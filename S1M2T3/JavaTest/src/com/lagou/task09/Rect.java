/*
    编程实现Rect类的封装并继承自Shape类，特征有：长度和宽度。
*/

package com.lagou.task09;

public class Rect extends Shape {

    private int len;
    private int wid;

    public Rect() {}

    public Rect(int x , int y , int len , int wid) {
        super(x , y);
        setLen(len);
        setWid(wid);
    }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        if (len > 0){
            this.len = len;
        } else {
            System.out.println("长度不合理哦！！！");
        }

    }

    public int getWid() {
        return wid;
    }

    public void setWid(int wid) {
        if (wid > 0 ){
            this.wid = wid;
        } else{
            System.out.println("宽度不合理哦！！！");
        }

    }

    @Override
    public void show() {
        super.show();
        System.out.println("len = " + getLen() + ", wid = " + getWid());
    }
}
