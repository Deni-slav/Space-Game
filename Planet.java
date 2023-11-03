package SpaceGame;

import java.util.List;

public class Planet extends OrbitableSpaceObject{
    private double metal;
    private double gas;
    private double crystal;
    private double uranium;

    public Planet(String name, double coordinateX, double coordinateY, double coordinateZ, double mass, double initialMetal, double initialGas,double initialCrystal,double initialUranium) {
        super(name, coordinateX, coordinateY, coordinateZ, mass);
        this.metal = initialMetal;
        this.gas = initialGas;
        this.crystal = initialCrystal;
        this.uranium = initialUranium;
    }
    public void harvestMetal(double amount) {
        if (metal >= amount) {
            metal -= amount;
            System.out.println("Harvested " + amount + " units of metal from " + getName());
        } else {
            System.out.println("Not enough metal to harvest.");
        }
    }

    public void harvestGas(double amount) {
        if (gas >= amount) {
            gas -= amount;
            System.out.println("Harvested " + amount + " units of gas from " + getName());
        } else {
            System.out.println("Not enough gas to harvest.");
        }
    }

    public void harvestCrystal(double amount) {
        if (crystal >= amount) {
            crystal -= amount;
            System.out.println("Harvested " + amount + " units of crystal from " + getName());
        } else {
            System.out.println("Not enough crystal to harvest.");
        }
    }

    public void harvestUranium(double amount) {
        if (uranium >= amount) {
            uranium -= amount;
            System.out.println("Harvested " + amount + " units of uranium from " + getName());
        } else {
            System.out.println("Not enough uranium to harvest.");
        }
    }

    @Override
    public void addOrbiter(SpaceObject orbiter) {
        super.addOrbiter(orbiter);
    }

    @Override
    public List<SpaceObject> getOrbiters() {
        return super.getOrbiters();


    }

    public void printResources() {
        System.out.println("Planet: " + getName() + " Resource Information");
        System.out.println("Metal: " + metal);
        System.out.println("Gas: " + gas);
        System.out.println("Crystal: " + crystal);
        System.out.println("Uranium: " + uranium);
    }

    public static void main(String[] args) {
        Planet earth = new Planet("Earth", 0.0, 0.0, 0.0, 5.972e24, 1000.0, 500.0, 300.0, 200.0);

        earth.printResources();
        earth.harvestMetal(200.0);
        earth.harvestGas(100.0);
        earth.harvestCrystal(50.0);
        earth.harvestUranium(30.0);
        earth.printResources();
    }
}