public class CurrentDisplay implements Observer , DisplayElement{
    private double temp;
    private double humidity;
    private double pressure;
    private WeatherInterface weatherdata;
    CurrentDisplay(WeatherInterface weatherdata){
        this.weatherdata = weatherdata;
        weatherdata.registerObeservers(this);
    }
   @Override
   public void update(double temp, double humidity, double pressure) {
       // TODO Auto-generated method stub
       this.temp=temp;
       this.humidity=humidity;
       this.pressure=pressure;
       display();
       
   }
    @Override
   public void display() {
       // TODO Auto-generated method stub
       System.out.println("Temperature -> "+temp);
       System.out.println("Humidity -> "+humidity);
       System.out.println("Pressure -> "+pressure);
       
   }    
}
