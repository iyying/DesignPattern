package club.kittypiggy.designpattern.bridge;

public abstract class Type {
    Brand brand;

    public Type(Brand brand) {
        this.brand = brand;
    }

    protected abstract void run();
}
