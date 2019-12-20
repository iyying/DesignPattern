package club.kittypiggy.designpattern.builder;

public class Seller {
    ComputerBuilder builder;

    public Seller(ComputerBuilder builder) {
        this.builder = builder;
    }

    Computer sell(){
        builder.buildMem().buildCpu().buildHd();
        return builder.getComputer();
    }
}
