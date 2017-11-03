package transport;

public class Road {
    private Vehicle[] Vehicles;
    private int numberOfVehicles;

    public Road() {
        this.Vehicles = new Vehicle[5];
        numberOfVehicles = 0;

    }

    public boolean addVehicle(double MaxLoad) {
        if (numberOfVehicles < this.Vehicles.length) {
            Vehicles[numberOfVehicles] = new Vehicle(MaxLoad);
            numberOfVehicles++;

                System.out.println("Creating a truck with " + MaxLoad + " Kg capacity");
                return true;
        } else {
            System.out.println("ERROR: THIS ROAD CAN ONLY LOAD 5 VEHICLES");
            return false;
        }
    }

    public int getNumberOfVehicles() {
        return numberOfVehicles;
    }

    public Vehicle getVehicle(int i) {
        if (i < Vehicles.length) {
            return Vehicles[i];
        }
        else {
            return null;
        }
    }
}

