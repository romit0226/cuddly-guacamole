package LowLevelDesign.HandleNullObject;

import com.conceptandcoding.LowLevelDesign.HandleNullObject.Vehicle;

public class Car implements Vehicle {

    @Override
    public int getTankCapacity() {
        return 40;
    }

    @Override
    public int getSeatingCapacity() {
        return 5;
    }
}
