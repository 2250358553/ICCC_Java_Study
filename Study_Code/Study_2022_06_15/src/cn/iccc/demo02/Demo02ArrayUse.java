package cn.iccc.demo02;

public class Demo02ArrayUse {

    public static void main(String[] args) {
        //创建静态数组
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr[0]);
        int len = arr.length;
        System.out.println(arr[len - 1]);
//        int[] arr1 = {12, 23, 534, 554};

        int[] arr1 = {1,2,3,4,5,7,9,345,8,679,345,86,2,6};
        int max = 0;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] > max){
                max = arr1[i];
            }
        }
        System.out.println(max);

    }
}
