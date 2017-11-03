package transport;

import javax.swing.plaf.synth.SynthEditorPaneUI;

public class TestRoad {
    static public void main(String args[]) {
        Road myRoad = new Road();
        myRoad.addVehicle(10000);
        myRoad.addVehicle(5000);
        myRoad.addVehicle(4000);
        myRoad.addVehicle(20000);
        myRoad.addVehicle(15000);
        myRoad.addVehicle(4000);

        Vehicle Truck = myRoad.getVehicle(4);
        boolean peso = Truck.addBox(10000);
        System.out.println(peso);
        peso = Truck.addBox(6000);
        System.out.println(peso);

        System.out.println("The total truck load number 4 is : " + Truck.getLoad() +  " KG");
    }
}
