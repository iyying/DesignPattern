package club.kittypiggy.designpattern.bridge;

public class Demo {

    public static void main(String[] args) {
        Laptop laptop = new Laptop(new Dell());

        laptop.run();
    }
}
