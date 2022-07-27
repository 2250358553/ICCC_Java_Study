package cn.iccc.demo05;

/*
字符串的截取方法：

public String substring(int index)：截取从参数位置一直到字符串末尾，返回新字符串。
public String substring(int begin, int end)：截取从begin开始，一直到end结束，中间的字符串。
备注：[begin,end)，包含左边，不包含右边。
 */
public class Demo05SubString {

    public static void main(String[] args) {
        //从指定位置截到尾
        String sub1 = "HelloWorld".substring(5);
        System.out.println(sub1);

        //指定开始位置和结束位置截取
        String sub2 = "HelloWorld".substring(4, 7);
        System.out.println(sub2);
    }

}
