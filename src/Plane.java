abstract class Plane implements Vehicle, Driveable {
    private double gasMileage;
    private int cabinCrewCount;

    public Plane(int cabinCrewNeeded, double gasMileage) {
        this.cabinCrewCount = cabinCrewNeeded;
        this.gasMileage = gasMileage;
    }

    public double getGasMileage() {
        return gasMileage;
    }

    public int getCabinCrewCount() {
        return cabinCrewCount;
    }

    @Override
    public void noise() {
        System.out.println("engine");
    }

    @Override
    public String[] getValidLicenseTypes() {
        return new String[]{"A"};
    }
}