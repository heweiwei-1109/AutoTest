package com.he.day05;

/**手机类
 * @author 土豆01
 *
 */
public class Mobilephone {
    /**
     * 品牌
     */
    public String brand;
    /**
     * 产品类型（几代）
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
        System.out.println(name+",晚上有空吗？一起吃饭");
        System.out.println("---此短信通过【"+this.brand+this.generation+"】手机发出");
    }
    
    //无参构造函数（默认构造函数）
    public Mobilephone(){
        
    }
    public Mobilephone(String brand,String generation,int price){
        this.brand = brand;
        this.generation = generation;
        this.price = price;
    }
    
    public static void main(String[] args) {
        //用华为p20给小明发短信
        Mobilephone mobilephone = new Mobilephone("华为", "p20", 8888);
        mobilephone.sendMessage("大白");
        
    }

}
