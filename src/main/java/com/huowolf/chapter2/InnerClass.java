package com.huowolf.chapter2;

/**
 * @创建人：王小伟
 * @创建时间： 2019/9/10
 * @描述：探究匿名内部类
 */
public class InnerClass {

    private int defaultAge = 5;

    public void addAge(int age){

        class NewAge{
            int getAge(){
                //age = 10; 这行会报错，说明age不可被修改。
                return age+defaultAge;
            }
        }

        NewAge newAge = new NewAge();
        System.out.println(newAge.getAge());
    }


    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass();
        innerClass.addAge(3);
    }

}



