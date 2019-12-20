package club.kittypiggy.designpattern.proxy.staticc;

public class Client {
    public static void main(String[] args) {
        Person landlord = new Landlord();
        Person agent = new Agent(landlord);
        agent.rent("asd");
    }
}
