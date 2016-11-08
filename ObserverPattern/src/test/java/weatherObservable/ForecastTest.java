package weatherObservable;

import com.guoyang.weatherObservable.ForecastDisplay;
import com.guoyang.weatherObservable.WeatherData;

/**
 * Created by HP on 2016/11/8.
 */
public class ForecastTest {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(33f,66f,663f);
        weatherData.deleteObserver(forecastDisplay);
    }
}
