package WithStrategyDrivePattern;

import WithStrategyDrivePattern.Strategy.SportsDrive;

public class SportsVehicle extends Vehicle{
    SportsVehicle() {
        super(new SportsDrive());
    }
}
