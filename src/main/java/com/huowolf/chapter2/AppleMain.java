package com.huowolf.chapter2;


import java.util.Arrays;
import java.util.List;

/**
 * @创建人：王小伟
 * @创建时间： 2019/9/10
 * @描述：
 */
public class AppleMain {

    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(new Apple(80,"green"), new Apple(155, "green"), new Apple(120, "red"));
        
        //根据筛选条件筛选苹果
        List<Apple> greenApples = AppleFilter.filterApples(inventory, new AppleGreenColorPredicate());
        System.out.println(greenApples);

        List<Apple> heavyApples = AppleFilter.filterApples(inventory, new AppleHeavyWeightPredicate());
        System.out.println(heavyApples);


        //通过Lambda表达式简化代码，无需预先定义ApplePredicate对象
        //同时根据颜色和重量来筛选苹果
        List<Apple> filterApples = AppleFilter.filterApples(inventory, apple -> "red".equals(apple.getColor()) && apple.getWeight() > 100);
        System.out.println(filterApples);
    }
}
