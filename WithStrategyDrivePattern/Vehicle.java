package WithStrategyDrivePattern;

import WithStrategyDrivePattern.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy obj;

    Vehicle(DriveStrategy obj){
        this.obj = obj;
    }
    public void drive() {
        obj.drive();
    }
}
