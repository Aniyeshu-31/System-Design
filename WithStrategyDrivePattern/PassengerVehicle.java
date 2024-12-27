package WithStrategyDrivePattern;

import WithStrategyDrivePattern.Strategy.NormalDrive;

public class PassengerVehicle extends Vehicle{
       PassengerVehicle() {
        super(new NormalDrive());
       }
    }

