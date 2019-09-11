package com.huowolf.chapter3;

import java.util.Arrays;
import java.util.List;

/**
 * @创建人：王小伟
 * @创建时间： 2019/9/11
 * @描述：理解方法引用
 */
public class Example3 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("a", "b", "A", "B");
        list.sort(String::compareToIgnoreCase);
        System.out.println(list);


    }
}
