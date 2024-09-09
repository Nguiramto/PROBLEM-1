package com.vehicle;

public class Car {

    private double speedKph;
    private float fuelLevel;
    private int distanceTraveled;

    public void setSpeed(double speed) {
        this.speedKph= speed;
    }

    public void setFuelLevel(float fuel) {
        this.fuelLevel= fuel;
    }

    public void drive(int distance) {

        // Implicit conversion from int to double
        this.distanceTraveled += distance;
    }

    public double getSpeedMph() {

        // Implicit conversion from double to double
        return this.speedKph/1.60934;
    }

    public double getDistanceKm() {

        // Implicit conversion from int to int
        return  this.distanceTraveled/1000.0;
    }

    public float calculateRemainingFuel(double distance) {

        // Implicit conversion from int to double
        double fuelConsumed = distance*0.5;

        // Explicit conversion from double to int
        this.fuelLevel -= fuelConsumed;
        return this.fuelLevel;
    }


}