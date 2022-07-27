package cn.iccc.demo03.demo06;
/*
静态代码块只执行唯一的一次
静态代码优先于非静态代码执行
 */
public class Demo03Static {

    public static void main(String[] args) {
        StaticTest1 st1 = new StaticTest1();
        StaticTest1 st2 = new StaticTest1();

    }

}
