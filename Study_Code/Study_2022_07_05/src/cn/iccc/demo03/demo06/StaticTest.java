package cn.iccc.demo03.demo06;

//静态不能直接访问非静态
public class StaticTest {

    int num;
    static int numStatic;

    //成员方法
    public void method(){
        System.out.println("成员方法");
        //成员方法可以访问成员变量
        System.out.println(num);
        //成员方法可以访问静态变量
        System.out.println(numStatic);
    }

    //静态方法 - 是属于类的，不是属于对象的

    public static void methodStatic() {
        System.out.println("静态方法");
        //静态方法可以访问静态变量
        System.out.println(numStatic);
        //静态方法不能访问成员变量
//        System.out.println(num);
    }

}
