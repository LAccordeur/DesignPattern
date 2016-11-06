package weatherTest;

import com.guoyang.weather.CurrentConditionsDisplay;
import com.guoyang.weather.WeatherData;

/**
 * Created by L'Accordeur on 2016/11/6.
 */
public class weather {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80,65,30.4f);
    }
}
