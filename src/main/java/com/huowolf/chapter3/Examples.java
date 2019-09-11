package com.huowolf.chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @创建人：王小伟
 * @创建时间： 2019/9/11
 * @描述：
 */
public class Examples {


    /**
     * Predicate 定义了一个名叫test的抽象方法，它接受泛型对象T,并返回一个boolean
     */
    public static <T> List<T> filter(List<T> list, Predicate<T> p){
        List<T> results = new ArrayList<>();

        for (T t : list) {
            if(p.test(t)){
                results.add(t);
            }
        }

        return results;
    }


    /**
     * Consumer 定义了一个名叫accept的抽象方法，它接受泛型对象T,没有返回（void）
     */
    public static <T> void forEach(List<T> list, Consumer<T> c){
        for (T t : list) {
            c.accept(t);
        }
    }


    /**
     * Function 定义了一个名叫Apply的抽象方法，它接受泛型对象T,并返回泛型对象R
     */
    public static <T,R> List<R> map(List<T> list,Function<T,R> f){
        List<R> result = new ArrayList<>();
        for (T t: list) {
            result.add(f.apply(t));
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> listOfString = Arrays.asList("zhangsan","","","lisi");
        System.out.println(listOfString);
        List<String> notEmptyList = filter(listOfString, s -> !s.isEmpty());
        System.out.println(notEmptyList);

        forEach(Arrays.asList(1,2,3,4,5), System.out::println);

        List<Integer> result = map(Arrays.asList("apple", "lambda", "java"), s -> s.length());
        System.out.println(result);


    }

}
