package cn.iccc.demo01;

public class Demo01Student {

    public static void main(String[] args) {
        //导包
        //创建类对象
        Student stu = new Student();

        //使用
        stu.name = "张三";
        stu.age = 16;
        System.out.println(stu.name);
        System.out.println(stu.age);

        //成员方法
        stu.eat();
        stu.sleep();
        stu.study();

    }

}
