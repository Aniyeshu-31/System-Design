package WithStrategyDrivePattern;

import WithStrategyDrivePattern.Strategy.OffRoadDrive;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle() {
        super(new OffRoadDrive());
    }
}
