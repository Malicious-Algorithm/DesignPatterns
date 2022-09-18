import service.CurrentConditionDisplay;
import service.WeatherData;

public class observerMain {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

       weatherData.setMeasurements(78, 90, 30.4f);
       weatherData.removeObserver(currentConditionDisplay);
       weatherData.setMeasurements(30, 45, 60.4f);
    }
}
