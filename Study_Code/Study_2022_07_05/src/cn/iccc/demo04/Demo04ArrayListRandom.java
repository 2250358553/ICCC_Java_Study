package cn.iccc.demo04;

import java.util.ArrayList;
import java.util.Random;

public class Demo04ArrayListRandom {

    public static void main(String[] args) {
        Random ra = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        int count = 20;
        while(count > 0){
            count--;
            int num = ra.nextInt(100) + 1;
            list.add(num);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("090453");
        System.out.println("=================");
        ArrayList<Integer> list2 = screen(list);
        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i) + " ");
        }

    }

    public static ArrayList<Integer> screen(ArrayList<Integer> list){
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0){
                list1.add(list.get(i));
            }
        }
        return list1;
    }

}
