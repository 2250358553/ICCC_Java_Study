package cn.iccc.demo05;


public class Demo01String {


    public static void main(String[] args) {
        //创建空参对象
        String str1 = new String();
        System.out.println(str1);

        //字符数组创建
//        char[] charArray = new char[] {'A','B','C'};
        char[] charArray = {'A', 'B', 'C'};
        String str2 = new String(charArray);
        System.out.println(str2);

        //字节数组创建
        byte[] byteArray = {97, 98, 99};
        String str3 = new String(byteArray);
        System.out.println(str3);

        //直接创建
        String str4 = "wdnmd";
        System.out.println(str4);

        String str5 = new String("hhh");
        System.out.println(str5);
    }
}
