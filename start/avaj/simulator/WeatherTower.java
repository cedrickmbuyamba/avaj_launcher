package start.avaj.simulator;

import start.avaj.weather.Coordinates;
import start.avaj.weather.WeatherProvider;


public class WeatherTower extends Tower {

    public String getWeather(Coordinates coordinates)
    {
        return WeatherProvider.getProvider().getCurrentWeather(coordinates);
    }

    void changeWeather()
    {
        this.conditionChanged();
    }

}
