package club.kittypiggy.designpattern.prototype;

public class Product implements Cloneable{
    int weight;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
