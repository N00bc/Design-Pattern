package com.cyn.designpattern.singleton;

/**
 * 饿汉式
 * 简单实用
 * 类加载到内存后，就实例化一个单例，JVM保证线程安全
 * @author Godc
 * @description: 饿汉式
 * @date 2023/2/20 8:52
 */
public class Manager01 {
    private static final Manager01 instance = new Manager01();

    private Manager01() {
    }

    public static Manager01 getInstance() {
        return instance;
    }
}
