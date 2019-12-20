package club.kittypiggy.designpattern.adaptor.standard;

/**
 * 适配器
 * @author yeyeye
 */
public class Adaptor implements Computer {

    private Dominate dominate;
    public Adaptor(Dominate dominate) {
        this.dominate = dominate;
    }

    @Override
    public void run(){
        dominate.cost();
    }

    public static void main(String[] args) {
        Adaptor adaptor = new Adaptor(new Dominate());

        adaptor.run();
    }
}
