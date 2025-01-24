import java.util.*;

public class WeatherData implements WeatherInterface {
    private double temp;
    private double humidity;
    private double pressure;
    private List<Observer> observer;
    public WeatherData() {
        observer = new ArrayList<>();
    }
    @Override
    public void registerObeservers(Observer o) {
        observer.add(o);
    } 
    @Override
    public void removeObservers(Observer o) {
       int index = observer.indexOf(o);
       if(index >= 0){
        observer.remove(index);
       }
    }
    @Override
     public void notifyObservers(double temp,double press,double hum) {
         // TODO Auto-generated method stub
         for(int i = 0;i < observer.size();i++) {
             Observer o = (Observer)observer.get(i);
             o.update(temp,hum,press);
         }
     }
     public void measurementsChanged(double temp,double press,double hum){
         notifyObservers(temp,press,hum);
     }
     public void setMeasurements(double temp,double humidity,double pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged(temp,pressure,humidity); // when this parameters are set to new values the this measurement changed method will run.
     } 
}
