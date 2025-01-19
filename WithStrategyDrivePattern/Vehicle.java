package WithStrategyDrivePattern;
public class Vehicle {
    DriveStrategy obj;
    Vehicle(){
    
    }
    public void drive() {
        obj.drive();
    }
}
