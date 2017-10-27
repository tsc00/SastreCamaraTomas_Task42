import transport.Vehicle;

/**
 * Creacion de la clase TestVehicle e importamos el transporte Vehicle
 */

public class TestVehicle {
    static public void main(String args[]) {
        Vehicle myVehicle = new Vehicle(10000);
        System.out.println("Creating a truck with " + myVehicle.getMaxLoad() + "KG");
        System.out.println(myVehicle.addBox(500));
        System.out.println(myVehicle.addBox(250));
        System.out.println(myVehicle.addBox(5000));
        System.out.println(myVehicle.addBox(6000));
        System.out.println(myVehicle.addBox(4000));
        System.out.println(myVehicle.addBox(300));
    }
    /**
     * Tomás Sastre Cámara
     * ASIX2n
     */

}