package tests;
import builders.CarBuilder;
import builders.ManualBuilder;
import builders.TruckBuilder;
import director.Director;
import domain.car.Car;
import domain.car.Manual;
import domain.car.Truck;

/**
 * Demo class. Everything comes together here.
 */
public class TestBuildTruck {

    public static void main(String[] args) {
        Director director = new Director();
        TruckBuilder builder = new TruckBuilder();
        director.constructTruck(builder);
        Truck truck = builder.getResult();
        System.out.println("Car built:\n" + truck.getCarType());

        ManualBuilder manualBuilder = new ManualBuilder();

        director.constructTruck(manualBuilder);
        Manual truckManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + truckManual.print());
    }
}