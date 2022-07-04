package cn.iccc.demo02;

public class Demo04Return {

    public static void main(String[] args) {
        Phone ph1 = method1();
        System.out.println(ph1.brand);
        System.out.println(ph1.color);
        System.out.println(ph1.price);

    }

    public static Phone method1(){
        Phone ph = new Phone();
        ph.brand = "锤子";
        ph.color = "白色";
        ph.price = 999;
        return ph;
    }

}
