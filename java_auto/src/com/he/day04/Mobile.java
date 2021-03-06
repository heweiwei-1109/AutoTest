package com.he.day04;


public class Mobile {
    //品牌
    public String brand;  //String默认值null
    //价格
    public int price;  //int默认值0
    //发短信 
    public void sendMessage(String name){  //void可以不return--发一条短信
            System.out.println(name+"在家吗，周末出去玩");
            System.out.println("-----发自价格为："+this.price+"，品牌为："+this.brand+"的手机");  
    } 
    public void sendMessage(String [] names){  //短信群发
        for (String name:names) {
            System.out.println(name+"在家吗，周末出去玩");
            System.out.println("-----发自价格为："+this.price+"，品牌为："+this.brand+"的手机");  
        }
    } 
    
    public void add(int a,int b){  //int、string等需要return
        //return a+b;
        System.out.println(a+b);
    }
    //返回手机的价格和品牌信息
    public String getMobleInfo(){
        return "手机品牌："+this.brand+"，手机价格："+this.price;
    }
    
    //无参构造函数，作用：创建一个最原始的对象
    public Mobile(){
        
    }
    
    /**带参构造函数，作用：能够按照我们的意愿来初始化一个对象
     * @param name
     * @param money
     */
    public Mobile(String name,int money){   //传入的name、money叫：形参
        this.brand = name;
        this.price = money;
    }

    public static void main(String[] args) {
        //通过调用无参构造函数，创建一个原始对象
        Mobile mobile01 = new Mobile();
        //通过调用带参构造函数，创建一个原始对象，品牌：华为，价格：8888
        Mobile mobile02 = new Mobile("华为", 8888);  //传入的参数叫：实参
//        //显示手机1的品牌和价格
//        String info01 = mobile01.getMobleInfo();
//        //显示手机2的品牌和价格
//        String info02 = mobile02.getMobleInfo();
//        System.out.println(info01);
//        System.out.println(info02);
//        
        //发短信一条
        mobile01.sendMessage("毛小白");
        mobile02.sendMessage("毛小白");
        mobile02.add(15, 20);
        String [] names ={"aa","bb","cc"};  
        mobile02.sendMessage(names);  //短信群发
        
    }
    
}
