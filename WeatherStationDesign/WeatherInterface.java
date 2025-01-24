public interface WeatherInterface {
    public void registerObeservers(Observer o);
    public void removeObservers(Observer o);
    public void notifyObservers(double temp,double press,double hum);
}