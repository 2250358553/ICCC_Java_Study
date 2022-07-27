package cn.iccc.demo05;

public class Demo08StringTest {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        String str = method(arr);
        System.out.println(str);

    }

    public static String method(int[] arr){
        String str = "[";

        for (int i = 0; i < arr.length; i++) {
            if(i < arr.length - 1) {
                str += "word" + arr[i] + "#";
            }else {
                str += "word" + arr[i];
            }
        }
        str += "]";
        return str;
    }

}
