package com.huowolf.chapter2;

/**
 * @创建人：王小伟
 * @创建时间： 2019/9/10
 * @描述：
 */
public class AppleGreenColorPredicate implements ApplePredicate {
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}
