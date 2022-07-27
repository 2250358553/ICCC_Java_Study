package cn.iccc.demo05;

import java.util.Arrays;
import java.util.Scanner;

public class Demo9StringTest1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str);

        //转换成Byte数组
        byte[] by = str.getBytes();
        int n = 0;
        int m = 0;
        int j = 0;
        int k = 0;
        for (int i = 0; i < by.length; i++) {
            if(by[i] >= 65 && by[i] <= 90){
                n++;
            }else if(by[i] >= 97 && by[i] <= 122){
                m++;
            }else if(by[i] >= 48 && by[i] <= 57){
                j++;
            }else{
                k++;
            }
        }
        System.out.println("大写字母有" + n + "个");
        System.out.println("小写字母有" + m + "个");
        System.out.println("数字有" + j  + "个");
        System.out.println("其他符号有" + k + "个");
        System.out.println(Arrays.toString(by));

    }

}
