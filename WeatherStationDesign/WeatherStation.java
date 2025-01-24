public class WeatherStation {
    public static void main(String[] args) throws Exception {
        WeatherData weatherData = new WeatherData();
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        weatherData.setMeasurements(23.56,60, 78);
        
    }
}
