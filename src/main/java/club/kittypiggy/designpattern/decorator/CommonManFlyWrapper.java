package club.kittypiggy.designpattern.decorator;

public class CommonManFlyWrapper extends CommonManWrapper {

    public CommonManFlyWrapper(Man man) {
        super(man);
    }
    @Override
    public void action() {
        super.action();
        fly();
    }
    private void fly(){
        System.out.println("我会飞...");
    }
}
