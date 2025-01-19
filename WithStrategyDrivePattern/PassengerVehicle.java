package WithStrategyDrivePattern;

public class PassengerVehicle extends Vehicle{      
         PassengerVehicle() {
           obj = new NormalDrive();
//             super(new NormalDrive());
         }
}

