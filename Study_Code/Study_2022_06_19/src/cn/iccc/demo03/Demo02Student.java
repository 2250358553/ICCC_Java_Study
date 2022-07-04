package cn.iccc.demo03;



public class Demo02Student {


    public static void main(String[] args) {

        Student stu1 = new Student();
        Student stu2 = new Student("雷军", 30);

//        System.out.println(stu2.name);
//        System.out.println(stu2.age);


        System.out.println(stu1.getName());
        System.out.println(stu1.getAge());
        System.out.println("==============================");
        System.out.println(stu2.getName());
        System.out.println(stu2.getAge());

    }

}
