package cn.iccc.demo04;

import java.util.ArrayList;
import java.util.Random;

public class Demo01ArrayListTest {

    public static void main(String[] args) {
        //创建对象
        ArrayList<Integer> list = new ArrayList<>();
        Random ra = new Random();

        //循环放入数组中
        for (int i = 0; i < 6; i++) {
            int num = ra.nextInt(32) + 1;
            list.add(num);
        }
        //遍历ArrayList集合中的元素
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
