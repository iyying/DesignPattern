package club.kittypiggy.designpattern.decorator;

public abstract class CommonManWrapper implements Man{
    private Man man;
    public CommonManWrapper(Man man) {
        this.man = man;
    }
    @Override
    public void action() {
        man.action();
    }
}
