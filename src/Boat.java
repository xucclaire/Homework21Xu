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

    public boolean isPropeller() {
        if (movementType.equals("propeller")){
            return true;
    }else {
            return false;
        }
    }
    public boolean isEngine() {
        if (movementType.equals("engine")){
            return true;
        }else {
            return false;
        }
    }
    public boolean isSails() {
        if (movementType.equals("sails")){
            return true;
        }else {
            return false;
        }
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