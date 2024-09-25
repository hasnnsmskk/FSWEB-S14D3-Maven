package org.example.company;

public class Mitsubishi extends Car{

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        System.out.println(getClass().getSimpleName() + " engine is starting in a different way.");
        return "Mitsubishi's engine is starting";
    }

    @Override
    public String accelerate() {
        System.out.println(getClass().getSimpleName() + " accelerates differently.");
        return "Mitsubishi is accelerating";
    }

    @Override
    public String brake() {
        System.out.println(getClass().getSimpleName() + " brakes differently.");
        return "Mitsubishi is braking";
    }
}
