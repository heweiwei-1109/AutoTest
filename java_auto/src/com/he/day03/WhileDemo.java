package com.he.day03;

public class WhileDemo {
    public static void main(String[] args) {
//        int x=-1;
//        do {
//            System.out.println(x);  //-1,0,1,2,3,4
//            x++;
//        } while (x>=0&&x<=5);
//        System.out.println("======");
//        System.out.println(x);
        
        int x = 0;
        while (x>=0&&x<=5) {
          System.out.println(x);  //-1,0,1,2,3,4
          x++; 
        }
        System.out.println("=====");
        System.out.println(x);
    }

}
