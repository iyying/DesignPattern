package club.kittypiggy.designpattern.bridge;

public class Dell implements Brand {
    @Override
    public void run() {
        System.out.println("戴尔");
    }
}
