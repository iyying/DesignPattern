package club.kittypiggy.designpattern.factory.method;

public class JpaIntFactory implements IntFactory {
    @Override
    public Integer getInt() {
        return new Integer(1);
    }
}
