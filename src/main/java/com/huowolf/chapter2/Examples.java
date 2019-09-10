package com.huowolf.chapter2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @创建人：王小伟
 * @创建时间： 2019/9/10
 * @描述：
 */
public class Examples {

    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(new Apple(80,"green"), new Apple(155, "green"), new Apple(120, "red"));

/*
        inventory.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple a1, Apple a2) {
                return a1.getWeight().compareTo(a2.getWeight());
            }
        });
        System.out.println(inventory);
*/

        inventory.sort((a1, a2) -> a1.getWeight().compareTo(a2.getWeight()));
        System.out.println(inventory);

        inventory.sort(Comparator.comparing(Apple::getWeight));
        System.out.println(inventory);



        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world");
            }
        }).start();


        new Thread(() -> System.out.println("Hello world")).start();
    }
}
