package com.cyn.designpattern.singleton;

/**
 * 枚举单例模式
 * 枚举类由public static final 修饰，保证线程安全
 * 防止反序列化
 * @author Godc
 * @description: 枚举方式实现单例
 * @date 2023/2/20 9:43
 */
public enum Manager05 {
    instance()
}
