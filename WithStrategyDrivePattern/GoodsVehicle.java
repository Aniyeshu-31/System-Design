package WithStrategyDrivePattern;
public class GoodsVehicle extends Vehicle{
    GoodsVehicle() {
//        super(new NormalDrive());
         obj = new NormalDrive();
    }
}
