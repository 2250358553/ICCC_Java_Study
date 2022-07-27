package cn.iccc.demo03;

import java.util.ArrayList;

/*
ArrayList当中常用的方法:
public boolean add(E e): 向集合中添加元素，参数类型和泛型一致
public E get(int index): 从集合中获取元素，参数是索引编号，返回值是被删除的元素
public E remove(int index): 从集合中删除元素，参数是索引编号，返回值是被删除的元素
public int size(): 获取集合中的尺寸长度，返回值是集合中的元素个数
 */
public class Demo03ArrayListMethod {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        //添加元素：add
        list.add("冰冰");
        list.add("自己");
        list.add("十元");
        System.out.println(list);
        System.out.println("================");

        //获取其中的元素: get
        String str1 = list.get(0);
        System.out.println(str1);
        System.out.println(list);
        System.out.println("================");

        //删除指定位置的元素: remove
        String remove = list.remove(0);
        System.out.println(remove);
        System.out.println(list);
        System.out.println("================");
        System.out.println(list.get(0)); //自己

        //输出数组中元素的个数: size
        System.out.println(list.size());


    }

}
