package com.cjj.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

@Book(value = "mybook", price = 89, authros = {"张三", "李四"})
public class Demo1 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, InvocationTargetException {
        Class<Demo1> clazz = Demo1.class;
        Book bookAnnotation = clazz.getAnnotation(Book.class);
        String[] authros = bookAnnotation.authros();
        System.out.println(Arrays.toString(authros));
        System.out.println(bookAnnotation.value());
        System.out.println(bookAnnotation.price());
        Method[] methods = clazz.getDeclaredMethods();
        Object obj = clazz.newInstance();
        for (Method method : methods) {
            if(method.isAnnotationPresent(MyTest.class)) {
                method.invoke(obj);
            }
        }
    }

    @MyTest
    public void tests01(){
        System.out.println("test01");
    }


    public void tests02(){
        System.out.println("test02");
    }

    @MyTest
    public void tests03(){
        System.out.println("test03");
    }
}
