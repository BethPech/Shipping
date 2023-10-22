package org.example;

public class ShipDialog extends Dialog {
    @Override
    public Transport createTransport() {
        return new Ship();
    }

    @Override
    public void shipPlanDelivery(){

    }
}
