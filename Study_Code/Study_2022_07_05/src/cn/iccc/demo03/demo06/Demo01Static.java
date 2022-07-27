package cn.iccc.demo03.demo06;

public class Demo01Static {

    public static void main(String[] args) {

        Student stu1 = new Student("张三",18);
        stu1.room = "三年二班";
        Student stu2 = new Student("李四",20);

        System.out.println(stu1.getName() + " " + stu1.getAge() + " " + stu1.room + " " + stu1.getId() );
        System.out.println(stu2.getName() + " " + stu2.getAge() + " " + stu2.room + " " + stu2.getId() );

    }

}
