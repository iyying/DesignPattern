package club.kittypiggy.designpattern.factory;

public class StaticFactory {

    public static <R,P> R getInstance(P type){
        //根据传入的type不同做if else判断返回不同类型的对象。
        return null;
    }

    /**
     *
     */
    public static <R,P> R getInstance01(){
        //创建一种类型的对象
        return null;
    }
    public static <R,P> R getInstance02(){
        //创建另一种类型的对象
        return null;
    }

    /**
     * 实例工厂模式
     * 静态方法可以继承，但是没有办法被重写，没有重写也就不可能实现多态的特性了。所以静态工厂是没有办法通过继承方式来动态改变工厂创建对象的行为的。
     */
    public <R,P> R getInstanceByInstance(P type){
        //根据传入的type不同做if else判断返回不同类型的对象。
        return null;
    }
}
