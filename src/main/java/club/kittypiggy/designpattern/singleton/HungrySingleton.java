package club.kittypiggy.designpattern.singleton;

public class HungrySingleton {

    private HungrySingleton() {
        if (INSTANCE != null) {
            // 这个异常也抛不出去，拦不住反射硬上
            try {
                throw new Exception("只能有一个对象");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static HungrySingleton INSTANCE = new HungrySingleton();

    public HungrySingleton getInstance() {

        return INSTANCE;
    }
}
