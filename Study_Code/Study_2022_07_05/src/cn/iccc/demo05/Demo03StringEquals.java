package cn.iccc.demo05;

public class Demo03StringEquals {

    public static void main(String[] args) {
        //字符串内容比较
        int a = 10;
        String str1 = "ccc";
        String str2 = "iccc";
        char[] ch = {'c','c','c'};
        String str3 = new String(ch);

        System.out.println(str1.equals(a));//false
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str2));
    }

}
