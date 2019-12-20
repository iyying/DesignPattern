package club.kittypiggy.designpattern.decorator;

public class Demo {

    public static void main(String[] args) {
        Man man = new CommonManPowerWrapper(new CommonManFlyWrapper(new CommonMan()));

        man.action();
    }
}
