package club.kittypiggy.designpattern.singleton;

public class StaticInnerSingleton {
    private StaticInnerSingleton() {
        if (StaticInnerSingletonInstance.INSTANCE != null) {
            // 这个异常抛不出去, 没用, 外边那个强盗还是拿到新对象了
            try {
                throw new Exception("只能创建一个对象！");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static class StaticInnerSingletonInstance {
        private static final StaticInnerSingleton INSTANCE = new StaticInnerSingleton();
    }

    public static StaticInnerSingleton getInstance() {
        return StaticInnerSingletonInstance.INSTANCE;
    }

    public void doSomething() {
        System.out.println("aaabbbccc");
    }
}
