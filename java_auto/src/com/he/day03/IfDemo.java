package com.he.day03;

public class IfDemo {
    public static void main(String[] args) {
        int score = 90;
//        if (score>=60) {
//            System.out.println("及格");
//        }
//        if (score<60) {
//            System.out.println("不及格");
//        }
        
//        if (score<=60) {
//            System.out.println("及格");
//        }       
//        else {
//            System.out.println("不及格");
//        }
        
//        //if....else if....else
//        if (score>=60 && score<80) {
//            System.out.println("及格");
//        }
//        else if (score>=80 && score<=100) {
//            System.out.println("优秀");
//        }
//        else if(score>=0 && score<60){
//            System.err.println("不及格");
//        }
//        else {
//            System.out.println("输入超出分数范围");
//        }
        
        //三目运算符A？B:C
        int a=1;
        int b=2;
        if (a>b) {
            System.out.println("a大于b");
        }
        else {
            System.out.println("a小于b");
        }
        System.out.println("========");
        System.out.println(a>b?"a大于b":"a小于b");
        
        
    }

}
