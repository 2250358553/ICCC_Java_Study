package cn.iccc.demo03;

public class Phone {

    private String brand;
    private String color;
    private int price;

    public void setBrand(String str){
        brand = str;
    }

    public String getBrand(){
        return brand;
    }

    public void setColor(String str){
        color = str;
    }

    public String getColor(){
        return color;
    }

    public void setPrice(int num){
        price = num;
    }

    public int getPrice(){
        return price;
    }

    public void call() {
        System.out.println("打电话");
    }

    public void send() {
        System.out.println("发短信");
    }

    public void movie() {
        System.out.println("看片");
    }

    public void happy() {

        System.out.println("刷最右");
    }

}
