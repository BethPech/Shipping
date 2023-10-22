package org.example;

public class Main {
    public static void main(String[] args) {
        ShipDialog shipDialog = new ShipDialog();
        shipDialog.shipPlanDelivery();

        TruckDialog truckDialog = new TruckDialog();
        truckDialog.truckPlanDelivery();

        System.out.println();

    }
}