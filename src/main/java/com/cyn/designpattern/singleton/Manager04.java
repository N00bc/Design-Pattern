package com.cyn.designpattern.singleton;

/**
 * 静态内部类的方式
 * 既有懒汉式懒加载的优点，又能保证线程安全
 * @author Godc
 * @description:
 * @date 2023/2/20 9:31
 */
public class Manager04 {
    private Manager04() {
    }

    private static class ManagerHolder {
        private static final Manager04 instance = new Manager04();
    }

    public static Manager04 getInstance() {
        return ManagerHolder.instance;
    }
}
