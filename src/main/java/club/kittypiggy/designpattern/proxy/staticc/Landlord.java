package club.kittypiggy.designpattern.proxy.staticc;

public class Landlord implements Person {
    @Override
    public void rent(String text) {
        System.out.println("客官请进，我家的房子又大又便宜，来租我的吧..." + text);
    }
}
