package org.example;

public class TruckDialog extends Dialog {
    @Override
    public Transport createTransport() {
        return new Truck();
    }

    @Override
    public void truckPlanDelivery(){
        Truck truck = new Truck();
        truck.startDeparture();
    }
}

