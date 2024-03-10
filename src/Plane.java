abstract class Plane implements Vehicle, Driveable {
    private int cabinCrewCount;

    public Plane(int cabinCrewNeeded) {
        this.cabinCrewCount = cabinCrewNeeded;
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