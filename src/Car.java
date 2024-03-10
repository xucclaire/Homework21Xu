abstract class Car implements Vehicle, Driveable {
    private boolean isManual;

    public Car(boolean isManual) {
        this.isManual = isManual;
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