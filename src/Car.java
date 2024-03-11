abstract class Car implements Vehicle, Driveable {
    private double gasMileage;
    private boolean isManual;

    public Car(boolean isManual, double gasMileage) {
        this.isManual = isManual;
        this.gasMileage = gasMileage;
    }

    public double getGasMileage() {
        return gasMileage;
    }

    public boolean isManual() {
        return isManual;
    }

    @Override
    public void noise() {
       System.out.println("honk");
    }

    @Override
    public String[] getValidLicenseTypes() {
        return new String[]{"A", "B", "C"};
    }
}