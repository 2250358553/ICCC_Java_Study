package cn.iccc.demo01;
/*
匿名对象
new 类名称();

注意事项：匿名对象只能使用唯一的一次，下次再想使用又要重新创建
使用建议：如果有一个确定的对象只需要使用唯一的一次，就可以使用匿名对象
 */
public class Demo01Person {

    public static void main(String[] args) {

        //常用 - 全参
        Person ps = new Person();
        ps.setName("哈哈哈");
        ps.show();

        //匿名创建对象
        new Person().setName("嘿嘿嘿");


    }

}
