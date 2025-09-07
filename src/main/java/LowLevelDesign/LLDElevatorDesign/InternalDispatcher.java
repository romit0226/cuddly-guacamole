package LowLevelDesign.LLDElevatorDesign;

import com.conceptandcoding.LowLevelDesign.LLDElevatorDesign.ElevatorCar;
import com.conceptandcoding.LowLevelDesign.LLDElevatorDesign.ElevatorController;
import com.conceptandcoding.LowLevelDesign.LLDElevatorDesign.ElevatorCreator;

import java.util.List;

public class InternalDispatcher {

    List<ElevatorController>  elevatorControllerList = ElevatorCreator.elevatorControllerList;

    public void submitInternalRequest(int floor, ElevatorCar elevatorCar){

    }
}
