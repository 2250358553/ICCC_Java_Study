package cn.iccc.demo03;
/*
定义一个数组，用来存储三个Person类
 */
public class Demo01Array {

    public static void main(String[] args) {

        //创建长度为3的数组，用来存放Person类
        Person[] array = new Person[3];
        Person ps1 = new Person("冰冰","女",18);
        Person ps2 = new Person("成果","女",19);
        Person ps3 = new Person("桥本环奈","女",20);
        array[0] = ps1; //地址值
        array[1] = ps2; //地址值
        array[2] = ps3; //地址值

        System.out.println(array[0].getName());

    }

}
