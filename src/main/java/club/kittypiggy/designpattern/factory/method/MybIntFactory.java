package club.kittypiggy.designpattern.factory.method;

public class MybIntFactory implements IntFactory {
    @Override
    public Integer getInt() {
        return new Integer(2);
    }
}
