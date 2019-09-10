package com.huowolf.chapter2;

import java.util.ArrayList;
import java.util.List;

/**
 * @ 创建人：王小伟
 * @ 创建时间： 2019/9/10
 * @ 描述：
 *
 * 行为参数化：让方法接受多种行为作为参数，并在内部使用，来完成不同的行为。
 * 让filterApples方法接受ApplePredicate对象，对Apple做条件测试，这就是行为参数化。
 * filterApples方法的行为取决于你通过ApplePredicate对象传递的代码。
 */
public class AppleFilter {

    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate predicate){
        List<Apple> apples = new ArrayList<>();

        for (Apple apple : inventory) {
            if(predicate.test(apple)){
                apples.add(apple);
            }
        }

        return apples;
    }



}
