package cn.iccc.demo02;

public class Demo01Array {

    public static void main(String[] args) {
        //创建一个数组  动态初始化
        int[] arr = new int[10];
        String[] arrS = new String[10];

        //静态初始化
        int[] arr1 = new int[] {1,2,3,4,5};
        String[] arr2 = new String[] {"String","Hello","World"};

        //静态初始化 - 省略格式
        int[] arr3 = {1,2,3,4,5};
        //求数组长度
        int sum = arr3.length;
        System.out.println(sum);


    }

}
