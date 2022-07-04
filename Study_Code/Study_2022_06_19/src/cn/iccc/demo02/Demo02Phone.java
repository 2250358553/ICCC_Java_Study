package cn.iccc.demo02;

public class Demo02Phone {

    public static void main(String[] args) {
        Phone ph = new Phone();
        ph.brand = "小米";
        ph.color = "幻境";
        ph.price = 1999;

        System.out.println(ph.brand);
        System.out.println(ph.color);
        System.out.println(ph.price);
        System.out.println("================");

        Phone ph1 = ph;

        System.out.println(ph1.brand);
        System.out.println(ph1.color);
        System.out.println(ph1.price);
        System.out.println("================");

        ph1.brand = "三星";
        ph1.color = "黄色";
        ph1.price = 3999;
        System.out.println(ph1.brand);
        System.out.println(ph1.color);
        System.out.println(ph1.price);

    }

}
