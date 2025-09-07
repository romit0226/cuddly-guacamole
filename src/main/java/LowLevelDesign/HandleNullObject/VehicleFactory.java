package LowLevelDesign.HandleNullObject;

import com.conceptandcoding.LowLevelDesign.HandleNullObject.NullVehicle;

public class VehicleFactory {


    static Vehicle getVehicleObject(String typeOfVehicle){

        if("Car".equals(typeOfVehicle)) {

            return new Car();
        }

        return new NullVehicle();
    }
}
