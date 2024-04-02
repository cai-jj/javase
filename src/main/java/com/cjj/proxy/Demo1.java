package com.cjj.proxy;


/**
 * 动态代理
 */
public class Demo1 {
    public static void main(String[] args) {
        SchoolService schoolService = (SchoolService) LogProxy.getProxyObject(new SchoolServiceImpl());
        System.out.println(schoolService.login("admin", "1234256"));

        System.out.println(schoolService.getAllClazzs());
    }
}
