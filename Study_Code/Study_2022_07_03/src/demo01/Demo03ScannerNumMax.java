package demo01;

import java.util.Scanner;

public class Demo03ScannerNumMax {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int max = 0;

        int a = sc.nextInt();
        if(a > max){
            max = a;
        }
        int b = sc.nextInt();
        if(b > max){
            max = b;
        }
        int c = sc.nextInt();
        if(c > max){
            max = c;
        }

        System.out.println(max);


    }

}
