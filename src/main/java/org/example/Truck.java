package org.example;

public class Truck implements Transport {

    public void render() {
        System.out.println("Render transport");
        onClick();
    }

    public void onClick() {
        System.out.println("Click on windows button!");
    }

    @Override
    public void startDeparture() {
        System.out.println("The truck started departure");
    }



}

