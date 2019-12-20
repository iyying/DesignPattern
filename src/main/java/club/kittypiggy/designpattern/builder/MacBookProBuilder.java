package club.kittypiggy.designpattern.builder;

public class MacBookProBuilder extends ComputerBuilder {
    @Override
    MacBookProBuilder buildMem() {
        comp.setMem("16g");
        return this;
    }

    @Override
    MacBookProBuilder buildCpu() {
        comp.setCpu("i7");
        return this;
    }

    @Override
    MacBookProBuilder buildHd() {
        comp.setHd("1T");
        return this;
    }
}
