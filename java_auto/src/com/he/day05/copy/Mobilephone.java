package com.he.day05.copy;

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
    
    /**给手机设置品牌
     * @param brand
     */
    public void setBrand(String brand){
        this.brand = brand;
    }
    
    /**给手机设置型号
     * @param generation
     */
    public void setGeneration(String generation){
        this.generation = generation; 
    }
    
    /**给手机设置价格
     * @param price
     */
    public void setPrice(Integer price){
        this.price = price;
    }
    
    /**获取平品牌
     * @return
     */
    public String getBrand(){
        return this.brand;
    }
    
    /**获取型号
     * @return
     */
    public String getGeneration(){
        return this.generation;
    }
    
    /**获取价格
     * @return
     */
    public int getPrice(){
        return this.price;
    }
    
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
        //用华为p20，给大白同学发短信
        Mobilephone mobilephone = new Mobilephone("华为","p20",8888);  //实参
        mobilephone.sendMessage("大白");
        
        Mobilephone mobilephone2 = new Mobilephone();   //mobilephone2---->是对象
        String name2 = "老王";
        mobilephone2.sendMessage(name2);
        System.out.println();
        
        Mobilephone mobilephone3 = new Mobilephone();
        //给mobilephone3设置一个品牌：小米
        mobilephone3.setBrand("小米");
        //给mobilephone3设置一个型号
        mobilephone3.setGeneration("2");
        //给mobilephone3设置一个价格
        mobilephone3.setPrice(1988);
        
        //取mobilephone3品牌
        String brand3 = mobilephone3.brand;
        //取mobilephone3型号
        String generation3 = mobilephone3.generation;
        //取mobilephone3价格
        int price3 = mobilephone3.price;
        System.out.println("brand3="+brand3+",generation3="+generation3+",price3="+price3);

    }
}