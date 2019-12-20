package club.kittypiggy.designpattern.bridge;

public class Tablet extends Type {
    public Tablet(Brand brand) {
        super(brand);
    }

    @Override
    protected void run() {
        System.out.println("平板");
    }
}
