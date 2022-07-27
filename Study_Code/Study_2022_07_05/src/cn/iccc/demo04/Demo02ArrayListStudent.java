package cn.iccc.demo04;

import java.util.ArrayList;

public class Demo02ArrayListStudent {

    public static void main(String[] args) {
        Student stu1 = new Student("张三",18);
        Student stu2 = new Student("李四",18);
        Student stu3 = new Student("王五",18);
        Student stu4 = new Student("赵六",18);

        ArrayList<Student> list = new ArrayList<>();

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);



        for (int i = 0; i < 4; i++) {
//            System.out.println(list.get(i).getName() + list.get(i).getAge());
            list.get(i).show();
        }
    }

}
