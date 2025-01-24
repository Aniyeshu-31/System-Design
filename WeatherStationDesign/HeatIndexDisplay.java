public class HeatIndexDisplay implements Observer , DisplayElement {
     private double temp;
     private double humidity;
     private double pressure;
     private double heatIndex;
     private WeatherInterface weatherdata;
     public HeatIndexDisplay(WeatherInterface weatherdata) {
        this.weatherdata = weatherdata;
        weatherdata.registerObeservers(this);
     }
    @Override
     public void display() {
         System.out.println("Temperature -> "+temp);
         System.out.println("Humidity -> "+humidity);
         System.out.println("Pressure -> "+pressure);
         System.out.println("HeatIndex -> "+heatIndex);
     }
     @Override
     public void update(double temp, double humidity, double pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;   
        heatIndex = temp * humidity * pressure;
        display();
     }
}
