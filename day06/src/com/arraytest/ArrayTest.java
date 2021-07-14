package com.arraytest;
//  数组的特点：
// 1）数组是有序排列的
// 2）数组属于引用数据类型的变量。数组的元素，既可以是基本数据类型，也可以是引用数据类型
// 3）创建数组对象会在内存中开辟一块连续的空间
// 4）数组的长度一旦确定，就不能修改

import java.io.PrintStream;

//  数组的分类：
// 1）按照维数：一维数组、二维数组。。。
// 2）按照数组元素的类型：基本数据类型元素的数组、引用数据类型元素的数组
public class ArrayTest{
    private static final PrintStream OUT = System.out;

    public static void main(String[] args) {
        // 声明数组和初始化：引用类型用new
        // 静态初始化
        int[] ids;
        ids = new int[]{1001,1002,1003,1004};
        // 动态初始化
        String[] names =new String[5];

        names[0] = "tom";
        OUT.println(ids[0]);
        OUT.println(names[0]);
        OUT.println(ids.length);
        for(int i = 0;i<ids.length;i++){
            OUT.println(ids[i]);
        }
    }
}