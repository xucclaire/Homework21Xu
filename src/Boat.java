abstract class Boat implements Vehicle, Driveable {
    private String movementType;

    public Boat(String movementType) {
        this.movementType = movementType;
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