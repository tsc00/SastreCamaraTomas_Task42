package transport;

/**
 * Creacion de una clase y constructor llamado Vehicle, con un load y maxLoad privado y double
 */
public class Vehicle {
    private double load;
    private double maxLoad;

    /**
     *
     * Creacion del metodo Vehicle
     */

    public Vehicle (double maxLoad) {
        this.maxLoad = maxLoad;
    }

    public double getLoad() {
        return load;
    }
    public double getMaxLoad() {
        return maxLoad;
    }
    public boolean addBox(double weight) {
        if (this.load + weight <maxLoad) {
            this.load = weight + this.load;
            System.out.println("We add a " +weight + " KG");
            return true;
        }
        else {
            System.out.println("We add a " +weight + " KG");
            System.out.println("The total truck load is: " + load+ " KG");
            return false;
        }
    }
    /**
     * Tomás Sastre Cámara
     * ASIX2n
     */
}