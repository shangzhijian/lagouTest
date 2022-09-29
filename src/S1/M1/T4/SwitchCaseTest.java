package S1.M1.T4;
/*
    编程使用switch case分支结构实现考试成绩的等级判断
 */

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SwitchCaseTest {

    public static void main(String[] args) {

        //1、提示用户输入成绩0~100
        System.out.println("请输入成绩0-100之间");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        //2、根据用户输入成绩判断等级，90-99 / 10 = 9 为 A
        // 80-89 / 10 = 8 为A ；70-80为B ，60-70為C ；60以下为D等级

        switch (score / 10) {
            case 9://case穿透
            case 8:
                System.out.println("等级A");break;
            case 7:
                System.out.println("等级B");break;
            case 6:
                System.out.println("等级C");break;
            default:
                System.out.println("等级D");break;
        }
    }

}
