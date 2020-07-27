package com.he.day05;

import java.time.chrono.MinguoChronology;

/**手机类
 * @author hewei
 *
 */
public class Mobilephone{
    /**
     * 品牌
     */
    public String brand;
    /**
     * 产品类型（代数）
     */
    public String generation;
    /**
     * 价格
     */
    public int price;
    
    /**
     * 发短信
     */
    public void sendMessage(String name){
        System.out.println(name+"晚上有空吗？一起吃饭");
        System.out.println("----此短信通过【"+this.brand+this.generation+"】发出");
    }                       //那个手机（对象）调用这个函数，这个this就指哪个手机（对象）
    /**
     * 无参构造函数（默认构造函数）
     */
    public Mobilephone(){
        
    }
    public Mobilephone(String brand,String generation,int price){  //形参
        this.brand = brand;
        this.generation =generation;
        this.price = price;
    }
    public static void main(String[] args) {
//        //用华为p20，给大白同学发短信
//        Mobilephone mobilephone = new Mobilephone("华为","p20",8888);  //实参
//        mobilephone.sendMessage("大白");
//        
        Mobilephone mobilephone2 = new Mobilephone();   //mobilephone2---->是对象
        String name2 = "老王";
        mobilephone2.sendMessage(name2);
        System.out.println();
        
        String [] names = {"aa","dd"};  //输入数组
        mobilephone2.test(names);
        
       //根据学员分数判读等级，并输出等级
       Mobilephone mobilephone03 =new Mobilephone(); 
       mobilephone03.grade(100);
       
       //根据学员分数判读等级，并返回返回返回等级
       String grde01 = mobilephone03.grade01(0);
       System.out.println(grde01); 
       
       //获取brand
       Mobilephone mobilephoneget = new Mobilephone("大米", "M20", 5000);
       String brand03 = mobilephoneget.getBrand();
       System.out.println(brand03);
       
       //return终止循环
       mobilephoneget.test();
    }
    
    public void test(String [] names){    //输入数组
        for (String name:names){
            System.out.println(name);
        }
    }
    
    //根据学员分数判读等级，并输出等级
    public void grade(int score){
        if (score>=0 &&score < 60) {
            System.out.println("C");
        }
        else if (score>=60 && score<=80) {
            System.out.println("B");
        }
        else if (score>=800 && score<=100) {
            System.out.println("A");
        }
        else {
            System.out.println("输入不正确");
        }
    }
    //根据学员分数判读等级，并返回返回返回等级
    public String grade01(int score){
        if (score>=0 &&score < 60) {
            return "C";
        }
        else if (score>=60 && score<=80) {
            return "B";
        }
        else if (score>=800 && score<=100) {
            return "A";
        }
        else {
            return "输入不正确";
        }
    }
    
    //获取brand
    public String getBrand(){
        return this.brand;
    }
    
    //return终止循环
    public int test(){
        for (int i = 0; i < +5; i++) {
            System.out.println(i);
            if (i==2) {
                return i;
            }    
        }
        return 10;
    }
    
    
    
}