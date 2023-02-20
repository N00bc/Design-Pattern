package com.cyn.designpattern.singleton;

/**
 * 双检锁的方式
 * @author Godc
 * @description:
 * @date 2023/2/20 9:26
 */
public class Manager03 {
    private static volatile Manager03 instance;

    private Manager03() {
    }

    public Manager03 getInstance() {
        if (instance == null) {
            synchronized (Manager03.class) {
                if (instance == null) {
                    instance = new Manager03();
                }
            }
        }
        return instance;
    }
}
