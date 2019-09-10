package com.huowolf.chapter2;


/**
 * @创建人：王小伟
 * @创建时间： 2019/9/10
 * @描述：
 *
 * 谓词对象封装了测试苹果的标准
 */
public interface ApplePredicate {

    boolean test(Apple apple);
}
