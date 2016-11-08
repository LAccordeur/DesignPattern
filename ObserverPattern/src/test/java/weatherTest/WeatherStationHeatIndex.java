package weatherTest;

import com.guoyang.weather.HeatIndexDisplay;
import com.guoyang.weather.WeatherData;

/**
 * Created by HP on 2016/11/8.
 */
public class WeatherStationHeatIndex {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80F,68F,33F);
    }
}
