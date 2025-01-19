package WithStrategyDrivePattern;
public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle() {
//        super(new OffRoadDrive());
         obj = new OffRoadDrive(); // 2nd Method to do this.
    }
}
