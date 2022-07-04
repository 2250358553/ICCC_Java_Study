package cn.iccc.demo01;

public class Demo01Method {

    public static void main(String[] args){

        System.out.println("Hello World");
        getSum();
    }

    //计算1-100的和
    public static void getSum(){
        int sum = 0;
        for(int i = 1; i <= 100; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
