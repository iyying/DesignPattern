package club.kittypiggy.designpattern.bridge;

public class HP implements Brand {
    @Override
    public void run() {
        System.out.println("惠普");
    }
}
