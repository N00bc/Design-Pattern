package com.cyn.designpattern.singleton;

/**
 * 懒汉式
 * 需要使用时加载对象，线程不安全
 *
 * @author Godc
 * @description: 懒汉式
 * @date 2023/2/20 9:00
 */
public class Manager02 {
    private static Manager02 instance;

    private Manager02() {
    }

    public static Manager02 getInstance() {
//        此处会出现线程不安全
        if (instance == null) {
            instance = new Manager02();
        }
        return instance;
    }
}
