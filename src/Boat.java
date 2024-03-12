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

    public boolean isPropeller() { //if movement uses a propeller, return true
        return movementType.equals("propeller");
    }
    public boolean isEngine() { //if movement uses an engine, return true
        return movementType.equals("engine");
    }
    public boolean isSails() { //if movement uses sails, return true
        return movementType.equals("sails");
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