package org.example.company;

public class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        System.out.println(getClass().getSimpleName() + " engine is starting in a different way.");
        return "Ford's engine is starting";
    }

    @Override
    public String accelerate() {
        System.out.println(getClass().getSimpleName() + " accelerates differently.");
        return "Ford is accelerating";
    }

    @Override
    public String brake() {
        System.out.println(getClass().getSimpleName() + " brakes differently.");
        return "Ford is braking";
    }
}
