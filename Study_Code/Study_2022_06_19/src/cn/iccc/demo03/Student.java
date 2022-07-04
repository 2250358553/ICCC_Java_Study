package cn.iccc.demo03;

public class Student {

    String name;
    int age;

    public Student() {
        System.out.println("无参构造方法执行！");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("全参构造方法执行");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

}
