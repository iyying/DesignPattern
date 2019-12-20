package club.kittypiggy.designpattern.singleton;

import java.lang.reflect.Constructor;

public class Demo {

    public static void main(String[] args) throws Exception {

        System.out.println(StaticInnerSingleton.getInstance());
        System.out.println(StaticInnerSingleton.getInstance());

        try {
            // private的构造函数不能用newInstance
            StaticInnerSingleton staticInnerSingleton1 = StaticInnerSingleton.class.newInstance();
            System.out.println("staticInnerSingleton1:" + staticInnerSingleton1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            // 将private的构造函数强行设置可见后就只能靠构造函数自己防了
            Constructor c0 = StaticInnerSingleton.class.getDeclaredConstructor();
            c0.setAccessible(true);
            StaticInnerSingleton staticInnerSingleton2 = (StaticInnerSingleton) c0.newInstance();
            System.out.println("staticInnerSingleton2:" + staticInnerSingleton2);
            staticInnerSingleton2.doSomething();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //============================= LazySingleton =============================
        System.out.println(LazySingleton.getInstance());
        System.out.println(LazySingleton.getInstance());

        try {
            // private的构造函数不能用newInstance
            LazySingleton lazySingleton1 = LazySingleton.class.newInstance();
            System.out.println("LazySingleton1:" + lazySingleton1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            // 将private的构造函数强行设置可见后就只能靠构造函数自己防了
            Constructor c0 = LazySingleton.class.getDeclaredConstructor();
            c0.setAccessible(true);
            LazySingleton lazySingleton2 = (LazySingleton) c0.newInstance();
            System.out.println("LazySingleton2:" + lazySingleton2);
            lazySingleton2.doSomething();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
