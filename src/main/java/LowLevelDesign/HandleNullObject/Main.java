package LowLevelDesign.HandleNullObject;

import com.conceptandcoding.LowLevelDesign.HandleNullObject.Vehicle;
import com.conceptandcoding.LowLevelDesign.HandleNullObject.VehicleFactory;

public class Main {

    public static void main(String args[]){


        Vehicle vehicle = VehicleFactory.getVehicleObject("Bike");
        printVehicleDetails(vehicle);
    }

    private static void printVehicleDetails(Vehicle vehicle) {
            System.out.println("Seating Capacity: " + vehicle.getSeatingCapacity());
            System.out.println("Fuel Tank Capacity: " + vehicle.getTankCapacity());
    }
}
