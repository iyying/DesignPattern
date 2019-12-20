package club.kittypiggy.designpattern.bridge;

public class Lenovo implements Brand {
    @Override
    public void run() {
        System.out.println("联想");
    }
}
