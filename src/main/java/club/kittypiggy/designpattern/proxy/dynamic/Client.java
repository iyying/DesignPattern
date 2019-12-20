package club.kittypiggy.designpattern.proxy.dynamic;

import club.kittypiggy.designpattern.proxy.staticc.Landlord;
import club.kittypiggy.designpattern.proxy.staticc.Person;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        Person landlord = new Landlord();
        Person proxy = (Person) Proxy.newProxyInstance(
                ClassLoader.getSystemClassLoader(), // 默认类加载器
                new Class[]{Person.class}, // 代理的接口
                new RentHandler(landlord));// 自定义调用处理器实现
        proxy.rent("String text");
    }
}
