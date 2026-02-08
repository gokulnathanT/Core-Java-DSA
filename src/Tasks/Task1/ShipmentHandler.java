package Tasks.Task1;

public class ShipmentHandler {

    public void monitorShipment(ShipmentListener listener){
        listener.onDepart("Erode");
    }

    public static void main(String[] args) {
        ShipmentHandler handler=new ShipmentHandler();
        ShipmentListener listener= (lo) -> {
            System.out.println(lo+" lambda");
        };
        handler.monitorShipment(listener);
    }
}
