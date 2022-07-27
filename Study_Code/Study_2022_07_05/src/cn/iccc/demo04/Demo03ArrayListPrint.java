package cn.iccc.demo04;

import java.util.ArrayList;

public class Demo03ArrayListPrint {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("哈哈哈");
        list.add("嘿嘿嘿");
        list.add("嘻嘻嘻");

        method(list);

    }

    public static void method(ArrayList<String> arr){
        System.out.print("{");
        for (int i = 0; i < arr.size(); i++) {
            if(i == arr.size() - 1){
                System.out.print(arr.get(i));
            }else {
                System.out.print(arr.get(i) + "@");
            }
        }
        System.out.print("}");
    }

}
