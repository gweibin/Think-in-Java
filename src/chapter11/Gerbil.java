package chapter11;

public class Gerbil {
    private int gerbilNumber;

    public Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    public void hop() {
        System.out.println("Gerbil " + gerbilNumber + " hops");
    }

    @Override
    public String toString() {
        return "Gerbil" + gerbilNumber;
    }
}