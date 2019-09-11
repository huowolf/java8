package com.huowolf.chapter3;

/**
 * @创建人：王小伟
 * @创建时间： 2019/9/11
 * @描述：
 */
public class Example2 {

    public static void main(String[] args) {


        int number = 100;

        Runnable runnable = () -> System.out.println(number);

        //number = 200; 这行会报错；因为lambda表达式引用的变量必须是final的，或事实上是final的

        System.out.println(number);
    }
}
