package cn.iccc.demo03;

public class Demo01SetGet {

    public static void main(String[] args) {

        Phone ph = new Phone();
        ph.setBrand("小米");
        ph.setColor("幻境");
        ph.setPrice(1999);

        System.out.println(ph.getBrand());
        System.out.println(ph.getColor());
        System.out.println(ph.getPrice());

    }

}
