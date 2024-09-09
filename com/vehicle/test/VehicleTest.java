package com.vehicle.test;
import com.vehicle.Car;
import com.vehicle.ElectricCar;

public class VehicleTest {

    public static void main(String[] args) {

        Car car = new Car();
        car.setSpeed(130);
        car.setFuelLevel(100);
        car.drive(1000000);


        System.out.println("Car:");
        System.out.println("The Car Speed in (MPH) is : " + car.getSpeedMph());
        System.out.println(" The Car Distance in (KM) is : " + car.getDistanceKm());
        System.out.println("The Remaining Fuel is : " + car.calculateRemainingFuel(5));

        ElectricCar electricCar = new ElectricCar();
        electricCar.setSpeed(100);
        electricCar.setFuelLevel(100);
        electricCar.setBatteryLevel(100);
        electricCar.drive(100000);

        System.out.println("ElectricCar:");
        System.out.println("The Electric Car Speed in (MPH) is : " + electricCar.getSpeedMph());
        System.out.println("The Electric Car Distance in (KM) is : " + electricCar.getDistanceKm());
        System.out.println("The Remaining Battery is : " + electricCar.getBatteryLevel() + "%");
    }
}
