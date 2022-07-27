package cn.iccc.demo05;

import java.util.Arrays;

/*
String当中与转换相关的常用方法有：

public char[] toCharArray()：将当前字符串拆分成为字符数组作为返回值。
public byte[] getBytes()：获得当前字符串底层的字节数组。
public String replace(CharSequence oldString, CharSequence newString)：
将所有出现的老字符串替换成为新的字符串，返回替换之后的结果新字符串。
备注：CharSequence意思就是说可以接受字符串类型。
*/
public class Demo06StringConvert {

    public static void main(String[] args) {
        //字符数组返回
        char[] ch = "Hello".toCharArray();
        System.out.println(Arrays.toString(ch));
        ch[0] = 'h';
        String str1 = new String(ch);
        System.out.println(str1);

        //字节数组返回
        byte[] by = "abc".getBytes();
        System.out.println(Arrays.toString(by));

        //老字符串替换为新字符串
        String str = "WorldHelloWorld".replace("World","ICCC");
        System.out.println(str);

    }

}
