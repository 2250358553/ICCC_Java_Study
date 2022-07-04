package cn.iccc.demo01;

/*
方法重载(Overload):方法名一样，但是参数不一样
*/
public class Demo02MethodOverload {

    public static void main(String[] args) {
        sum(10,29);
        sum(10,290,13);
        sum(10,290,13,123);
    }

    //两数字相加
    public static void sum(int a, int b){
        System.out.println(a+b);
    }
    //三数字相加
    public static void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
    //四数字相加
    public static void sum(int a, int b, int c, int d){
        System.out.println(a+b+c+d);
    }

}
