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
        
//        //三目运算符A？B:C
//        int a=1;
//        int b=2;
//        if (a>b) {
//            System.out.println("a大于b");
//        }
//        else {
//            System.out.println("a小于b");
//        }
//        System.out.println("========");
//        System.out.println(a>b?"a大于b":"a小于b");
        
        
//        //作业直角三角形
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println("*");
//        }
        
//        //作业等边三角形
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5-i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//                System.out.print(" ");
//            }
//            System.out.println("*");
//        }  
        
//        //求0到100的偶数和与奇数和       
//        int count1=0;
//        int count2=0;
//        for (int i = 0; i <= 100; i++) {
//           
//            if (i%2==0) {   //偶数求和
//                count1+=i;
//            }
//            if (i%2==1) {   //奇数求和
//                count2+=i;
//            }
//        }
//        System.out.println(count1);
//        System.out.println(count2);
        
        //冒泡排序[4,1,3,2,5]
        int [] arr = {4,1,3,2,5,6,3};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] < arr[j+1]) {  //目前是从大到小排列。要从小到大排列把“<”换成“>”
                    int temp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }  
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print("  "+arr[i]);
        }
    }
}
