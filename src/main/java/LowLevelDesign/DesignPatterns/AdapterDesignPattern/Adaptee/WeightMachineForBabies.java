package LowLevelDesign.DesignPatterns.AdapterDesignPattern.Adaptee;

import com.conceptandcoding.LowLevelDesign.DesignPatterns.AdapterDesignPattern.Adaptee.WeightMachine;

public class WeightMachineForBabies implements WeightMachine {
    @Override
    public double getWeightInPound() {
        return 28;
    }
}
