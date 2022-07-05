package cn.iccc.demo01;

import java.util.Scanner;

public class Demo02Scanner {

    public static void main(String[] args) {

        //常见
//        Scanner sc = new Scanner(System.in);
//        System.out.println(sc.nextInt());

        //匿名创建
//        System.out.println(new Scanner(System.in).nextInt());

        /*
        匿名对象作为参数
         */
        //常见
//        Scanner sc1 = new Scanner(System.in);
//        methodParam(sc1);

        //匿名
//        methodParam(new Scanner(System.in));

        /*
        匿名对象作为返回值
         */
        System.out.println(methodReturn().nextInt());
    }


    public static void methodParam(Scanner sc){
        System.out.println("输入的数字是：" + sc.nextInt());
    }

    public static Scanner methodReturn(){
        //常见
//        Scanner sc2 = new Scanner(System.in);
//        return sc2;
        //匿名对象
        return new Scanner(System.in);
    }

}
