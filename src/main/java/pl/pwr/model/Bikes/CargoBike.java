package pl.pwr.model.Bikes;

import pl.pwr.model.Condition;

public class CargoBike extends Bike{
    private double cargoCapacity;
    private boolean hasElectricAssist;
    private String cargoAreaType;
    private boolean hasChildSeat;

    public CargoBike(int id, double price, String name, String description, boolean isAvailable, Condition condition,
                     double cargoCapacity, boolean hasElectricAssist, String cargoAreaType, boolean hasChildSeat) {
        super(id, price, name, description, isAvailable, condition);
        this.cargoCapacity = cargoCapacity;
        this.hasElectricAssist = hasElectricAssist;
        this.cargoAreaType = cargoAreaType;
        this.hasChildSeat = hasChildSeat;
    }

    public CargoBike(double cargoCapacity, boolean hasElectricAssist, String cargoAreaType, boolean hasChildSeat) {
        this.cargoCapacity = cargoCapacity;
        this.hasElectricAssist = hasElectricAssist;
        this.cargoAreaType = cargoAreaType;
        this.hasChildSeat = hasChildSeat;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public boolean isHasElectricAssist() {
        return hasElectricAssist;
    }

    public void setHasElectricAssist(boolean hasElectricAssist) {
        this.hasElectricAssist = hasElectricAssist;
    }

    public String getCargoAreaType() {
        return cargoAreaType;
    }

    public void setCargoAreaType(String cargoAreaType) {
        this.cargoAreaType = cargoAreaType;
    }

    public boolean isHasChildSeat() {
        return hasChildSeat;
    }

    public void setHasChildSeat(boolean hasChildSeat) {
        this.hasChildSeat = hasChildSeat;
    }

}
