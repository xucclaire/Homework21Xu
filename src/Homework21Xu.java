//Claire Xu
//AP CS G
//Homework 21

import java.util.Arrays;
public class Homework21Xu {
    public static void main(String[] args) {
        // Testing a Car
        System.out.println("Testing Cars");
        Car car1 = new Car("automatic", 5) {};
        System.out.println(car1.getGasMileage() == 5);
        car1.noise(); //honk
        System.out.println(car1.getTransmission().equals("automatic"));
        System.out.println(car1.isAutomatic() == true);
        System.out.println(car1.isManual() == false);
        String[] str = {"A", "B", "C"};
        System.out.println(Arrays.equals(car1.getValidLicenseTypes(), str));
        System.out.println();

        Car car2 = new Car("manual", 8) {};
        System.out.println(car2.getGasMileage() == 8);
        System.out.println(car2.getTransmission().equals("manual"));
        System.out.println(car2.isAutomatic() == false);
        System.out.println(car2.isManual() == true);
        System.out.println();

        // Testing a Boat
        System.out.println("Testing Boats");
        Boat boat1 = new Boat("propeller", 5) {};
        System.out.println(boat1.getGasMileage() == 5);
        boat1.noise(); //horn
        System.out.println(boat1.getMovementType().equals("propeller"));
        System.out.println(boat1.isPropeller() == true);
        System.out.println(boat1.isEngine() == false);
        System.out.println(boat1.isSails() == false);
        String[] str2 = {"A", "B"};
        System.out.println(Arrays.equals(boat1.getValidLicenseTypes(), str2));
        System.out.println();
        Boat boat2 = new Boat("engine", 5) {};
        System.out.println(boat2.getGasMileage() == 5);
        System.out.println(boat2.getMovementType().equals("engine"));
        System.out.println(boat2.isPropeller() == false);
        System.out.println(boat2.isEngine() == true);
        System.out.println(boat2.isSails() == false);
        System.out.println();

        Boat boat3 = new Boat("sails", 5) {};
        System.out.println(boat3.getGasMileage() == 5);
        System.out.println(boat3.getMovementType().equals("sails"));
        System.out.println(boat3.isPropeller() == false);
        System.out.println(boat3.isEngine() == false);
        System.out.println(boat3.isSails() == true);
        System.out.println();

        // Testing a Plane
        System.out.println("Testing a Plane");
        Plane plane = new Plane(50, 5) {};
        System.out.println(plane.getGasMileage() == 5);
        plane.noise(); //engine
        System.out.println(plane.getCabinCrewCount() == 50);
        String[] str3 = {"A"};
        System.out.println(Arrays.equals(plane.getValidLicenseTypes(), str3));

    }
}
