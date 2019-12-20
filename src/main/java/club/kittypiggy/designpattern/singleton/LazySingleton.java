package club.kittypiggy.designpattern.singleton;

public class LazySingleton {

    private LazySingleton() throws Exception {
        if (INSTANCE != null) {
            throw new Exception("only one instance");
        }
    }

    private static volatile LazySingleton INSTANCE = null;

    public static LazySingleton getInstance() throws Exception {
        if (INSTANCE == null) {
            synchronized(LazySingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LazySingleton();
                }
            }
        }

        return INSTANCE;
    }

    public void doSomething() {
        System.out.println("aaabbbccc");
    }
}
