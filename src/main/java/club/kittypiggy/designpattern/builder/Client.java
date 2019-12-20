package club.kittypiggy.designpattern.builder;

public class Client {

    public Computer buy(Seller seller){
        return seller.sell();
    }

    public static void main(String[] args) {
        Client c = new Client();
        System.out.println(c.buy(new Seller(new MacBookProBuilder())));
    }
}
