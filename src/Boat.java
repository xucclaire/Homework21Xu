abstract class Boat implements Vehicle, Driveable {
    private double gasMileage;
    private String movementType;

    public Boat(String movementType, double gasMileage) {
        this.movementType = movementType;
        this.gasMileage = gasMileage;
    }

    public double getGasMileage() {
        return gasMileage;
    }
    public String getMovementType() {
        return movementType;
    }

    @Override
    public void noise() {
        System.out.println("horn");
    }
    @Override
    public String[] getValidLicenseTypes() {
        return new String[]{"A", "B"};
    }
}