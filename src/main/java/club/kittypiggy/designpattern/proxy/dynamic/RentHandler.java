package club.kittypiggy.designpattern.proxy.dynamic;

import club.kittypiggy.designpattern.proxy.staticc.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class RentHandler implements InvocationHandler {
    Person landlord;

    public RentHandler(Person landlord) {
        this.landlord = landlord;
    }

    //客户端对代理对象发起的所有请求都会被委托给该方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //前置处理
        System.out.println("经过前期调研，西湖边的房子环境挺好的...");
        //委托给真实角色处理业务逻辑
        method.invoke(landlord, args);
        //后置处理
        System.out.println("房子漏水，帮你联系维修人员...");
        return null;
    }
}