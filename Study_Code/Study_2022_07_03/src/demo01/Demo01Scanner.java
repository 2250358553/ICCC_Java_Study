package demo01;
import java.util.Scanner;

public class Demo01Scanner {

    public static void main(String[] args) {

        //创建Scanner对象
        //System.in - 代表键盘输入
        Scanner sc1 = new Scanner(System.in);
        //字符串
        Scanner sc2 = new Scanner(System.in);
        System.out.println(sc1.nextInt());

        System.out.println(sc2.nextInt());


    }

}
