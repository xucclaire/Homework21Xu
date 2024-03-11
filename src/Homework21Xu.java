import java.util.Arrays;

public class Homework21Xu {
    public static void main(String[] args) {
        // Testing a Car
        Car car = new Car("automatic", 5) {};
        System.out.println(car.getGasMileage() == 5);
        car.noise(); //honk
        System.out.println(car.getTransmission().equals("automatic"));
        System.out.println(car.isAutomatic() == true);
        System.out.println(car.isManual() == false);
        String[] str = {"A", "B", "C"};
        System.out.println(Arrays.equals(car.getValidLicenseTypes(), str));
        System.out.println();

        // Testing a Boat
        Boat boat = new Boat("propeller", 5) {};
        System.out.println(boat.getGasMileage() == 5);
        boat.noise(); //horn
        System.out.println(boat.getMovementType().equals("propeller"));
        System.out.println(boat.isPropeller() == true);
        System.out.println(boat.isEngine() == false);
        System.out.println(boat.isSails() == false);
        String[] str2 = {"A", "B"};
        System.out.println(Arrays.equals(boat.getValidLicenseTypes(), str2));
        System.out.println();

        // Testing a Plane
        Plane plane = new Plane(50, 5) {};
        System.out.println(plane.getGasMileage() == 5);
        plane.noise(); //engine
        System.out.println(plane.getCabinCrewCount() == 50);
        String[] str3 = {"A"};
        System.out.println(Arrays.equals(plane.getValidLicenseTypes(), str3));

    }
}
