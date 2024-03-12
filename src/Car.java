abstract class Car implements Vehicle, Driveable {
    private double gasMileage;
    private String transmission;

    public Car(String transmission, double gasMileage) {
        this.transmission = transmission;
        this.gasMileage = gasMileage;
    }

    public double getGasMileage() {
        return gasMileage;
    }

    public String getTransmission() {
        return transmission;
    }

    public boolean isAutomatic() { //if car is automatic, return true
        return transmission.equals("automatic");
    }
    public boolean isManual() { //if car is manual, return true
        return transmission.equals("manual");
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