package builders;

import domain.car.types.CarType;
import domain.components.Engine;
import domain.components.GPSNavigator;
import domain.components.Transmission;
import domain.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setWheels(int wheels);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}