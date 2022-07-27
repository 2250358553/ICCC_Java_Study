package cn.iccc.demo03.demo06;

public class Demo02Static {

    public static void main(String[] args) {
        StaticTest st = new StaticTest();
        //调用成员方法
        st.method();//正常使用

        //调用静态方法
        st.methodStatic();//使用对象名.方法名 - 正确但不推荐 - 被javac翻译后还是会变成类名称.方法名
        StaticTest.methodStatic();//使用类名称.方法名 - 正确，推荐
    }

}
