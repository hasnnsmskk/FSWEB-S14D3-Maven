package org.example.arge;

public class ElectircCar extends CarSkeleton{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectircCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " electric engine is starting.");
    }

    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName() + " is driving with electricity.");
        super.runEngine();
    }
}
