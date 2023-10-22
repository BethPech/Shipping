package org.example;

public abstract class Dialog {

    public void renderWindow() {
        // ... остальной код диалога ...

        Transport transport = createTransport();
        transport.render();
    }

    /**
     * Подклассы будут переопределять этот метод, чтобы создавать конкретные
     * объекты продуктов, разные для каждой фабрики.
     */
    public abstract Transport createTransport();

    public void truckPlanDelivery(){
        Truck truck = new Truck();
        truck.startDeparture();

    }

    public void shipPlanDelivery(){
        Ship ship = new Ship();
        ship.startDeparture();
    }

}

