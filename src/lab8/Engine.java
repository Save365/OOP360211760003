package lab8;

public class Engine {
    private int engSize ;
    private int horsePower ;
    public   Engine(){}

    public Engine(int engSize, int horsePower) {
        this.engSize = engSize;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "engSize=" + engSize +
                ", horsePower=" + horsePower +
                '}';
    }

    public int getEngSize() {
        return engSize;
    }

    public void setEngSize(int engSize) {
        this.engSize = engSize;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
