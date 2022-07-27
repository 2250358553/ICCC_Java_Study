package cn.iccc.demo03;

import sun.security.krb5.internal.crypto.Aes128CtsHmacSha1EType;

import java.util.ArrayList;

/*
如果希望向集合ArrayList中存放基本数据类型，必须使用基本类型所对应的”包装类“。
基本类型    包装类(引用类型，包装类都位于java.lang包下，不用导包)
byte        Byte
short       Short
int         Integer(特殊)
long        Long
float       Float
double      Double
boolean     Boolean
char        Character(特殊)

从JDK 1.5+开始，支持自动装箱、自动拆箱
自动装箱：基本类型-->引用类型
自动拆箱：引用类型-->基本类型
 */
public class Demo05ArrayListBasic {

    public static void main(String[] args) {
        //错误写法
//        ArrayList<int> list = new ArrayList<>();
        //正确写法
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(23);
        list.add(42);
        System.out.println(list);
    }

}
