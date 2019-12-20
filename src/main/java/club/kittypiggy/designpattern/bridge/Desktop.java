package club.kittypiggy.designpattern.bridge;

public class Desktop extends Type {
    public Desktop(Brand brand) {
        super(brand);
    }

    @Override
    protected void run() {
        System.out.println("台式");
    }
}
