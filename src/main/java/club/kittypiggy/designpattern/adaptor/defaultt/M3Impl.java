package club.kittypiggy.designpattern.adaptor.defaultt;

public class M3Impl extends DefaultAdaptor {

    @Override
    public void m3() {
        System.out.println("不用实现最底层接口里的另外两个方法");
    }
}
