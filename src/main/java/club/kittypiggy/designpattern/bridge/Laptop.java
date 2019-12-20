package club.kittypiggy.designpattern.bridge;

public class Laptop extends Type {
    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    protected void run() {
        System.out.println("笔记本");
    }
}
