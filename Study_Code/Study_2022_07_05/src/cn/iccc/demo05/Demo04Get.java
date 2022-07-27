package cn.iccc.demo05;

/*
String当中与获取相关的常用方法有：

public int length()：获取字符串当中含有的字符个数，拿到字符串长度。
public String concat(String str)：将当前字符串和参数字符串拼接成为返回值新的字符串。
public char charAt(int index)：获取指定索引位置的单个字符。（索引从0开始。）
public int indexOf(String str)：查找参数字符串在本字符串当中首次出现的索引位置，如果没有返回-1值。
 */

public class Demo04Get {

    public static void main(String[] args) {
        //字符串长度
        int length = "ajflkjdsafjals".length();
        System.out.println(length);

        //字符串拼接
        String str = "Hello".concat("World");
        System.out.println(str);

        //获取指定位置字符
        char ch = "Iccc".charAt(0);
        System.out.println(ch);

        //查找字符并返回，无则返回-1
        int index = "Hello".indexOf("p");
        System.out.println(index);

    }

}
