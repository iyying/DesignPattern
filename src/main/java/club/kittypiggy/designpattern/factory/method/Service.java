package club.kittypiggy.designpattern.factory.method;

public class Service {

    private Integer inte;

    public Service(IntFactory intFactory) {
        this.inte = intFactory.getInt();
    }

    public static void main(String[] args) {
        Service service = new Service(new MybIntFactory());
        System.out.println(service.inte);
    }
}
