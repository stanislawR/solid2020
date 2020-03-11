package pl.zzpj2020.solid.ocp.usa.solution;

public class ALFineCalculator implements FineCalculator {
    @Override
    public double calculateFine(int speed) {
        return 0;
    }

    @Override
    public int getMaxSpeed() {
        return 70;
    }
}
