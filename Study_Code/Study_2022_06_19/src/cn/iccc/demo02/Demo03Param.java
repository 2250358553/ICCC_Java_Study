package cn.iccc.demo02;

public class Demo03Param {

    public static void main(String[] args) {

        Phone ph = new Phone();
        ph.brand = "小米";
        ph.color = "幻境";
        ph.price = 1999;
        method(ph);

    }

    public static void method(Phone p){
        System.out.println(p.brand);
        System.out.println(p.price);
        System.out.println(p.color);
    }

}
