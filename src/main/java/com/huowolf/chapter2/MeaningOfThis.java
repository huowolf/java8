package com.huowolf.chapter2;

/**
 * @创建人：王小伟
 * @创建时间： 2019/9/10
 * @描述：匿名类谜题
 */
public class MeaningOfThis {

    public final int value = 4;

    public void doIt(){
        int value = 6;

        new Runnable() {
            private int value = 5; //网上说的jdk8默认自动为该变量添加final修饰符？

            @Override
            public void run() {
                int value = 10;
                System.out.println(this.value);
                System.out.println(value);

                this.value=8;   //那这里该变量怎么还可以被修改？？？
                System.out.println(this.value);

                System.out.println(MeaningOfThis.this.value);

            }
        }.run();

    }

    public static void main(String[] args) {
        MeaningOfThis m = new MeaningOfThis();
        m.doIt();
    }
}
