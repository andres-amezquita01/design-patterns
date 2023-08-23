package tests;
import builders.CarBuilder;
import builders.ManualBuilder;
import director.Director;
import domain.car.Car;
import domain.car.Manual;

/**
 * Demo class. Everything comes together here.
 */
public class TestBuildSportCar {

    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());


        ManualBuilder manualBuilder = new ManualBuilder();

        // Director may know several building recipes.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}