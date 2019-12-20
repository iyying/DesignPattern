package club.kittypiggy.designpattern.builder;

public class Computer {
    String mem;
    String cpu;
    String hd;

    public String getMem() {
        return mem;
    }

    public void setMem(String mem) {
        this.mem = mem;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "mem='" + mem + '\'' +
                ", cpu='" + cpu + '\'' +
                ", hd='" + hd + '\'' +
                '}';
    }
}
