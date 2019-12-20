package club.kittypiggy.designpattern.decorator;

public class CommonManPowerWrapper extends CommonManWrapper {

    public CommonManPowerWrapper(Man man) {
        super(man);
    }
    @Override
    public void action() {
        super.action();
        power();
    }
    private void power(){
        System.out.println("无穷力量!");
    }
}
