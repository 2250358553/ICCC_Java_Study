package cn.iccc.demo03;

import java.util.ArrayList;
/*
普通数组长度不可以发生改变
但是ArrayList的长度是可以发生改变的，

对于ArrayList来说，<E>代表泛型,尖括号中是什么类型，就代表集合中的数据都是什么类型
注意： 只能是引用类型，不能是基本类型

注意事项：
    对于ArrayList集合来说，直接打印得到的不是地址值，而是里面的额内容[...]

 */
public class Demo02ArrayList {

    public static void main(String[] args) {
        //创建一个全是String类型的集合
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
        System.out.println("==============");
        list.add("冰冰");
        list.add("十元");
        System.out.println(list);
    }

}
