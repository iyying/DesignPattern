package club.kittypiggy.designpattern.builder;

public abstract class ComputerBuilder {
    protected Computer comp = new Computer();
    abstract ComputerBuilder buildMem();
    abstract ComputerBuilder buildCpu();
    abstract ComputerBuilder buildHd();
    protected Computer getComputer(){
        return comp;
    }
}
