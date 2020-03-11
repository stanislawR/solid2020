package pl.zzpj2020.solid.ocp.usa.solution;

public class GAFineCalculator implements FineCalculator {
    @Override
    public double calculateFine(int speed) {
        return speed*3.5+150;
    }

    @Override
    public int getMaxSpeed() {
        return 50;
    }
}
