package start.avaj.simulator.vehicles;

import start.avaj.simulator.WeatherTower;


public interface Flyable {
    void updateConditions();
    void registerTower(WeatherTower weatherTower);
}
