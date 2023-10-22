package org.example;

public class Ship implements Transport {
    public void render() {
        System.out.println("Render Ship");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }

    @Override
    public void startDeparture() {
        System.out.println("The ship started departure");
    }


}

