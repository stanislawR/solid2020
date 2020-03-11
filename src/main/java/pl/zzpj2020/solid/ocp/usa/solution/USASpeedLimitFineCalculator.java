package pl.zzpj2020.solid.ocp.usa.solution;

public class USASpeedLimitFineCalculator {

    public double calcualateSpeedLimitFine(FineCalculator fineCalculator, int speed) {

        double fine = 0.0;
        if (speed > fineCalculator.getMaxSpeed()) {
            fine = fineCalculator.calculateFine(speed);
        }
        return fine;

    }
}
