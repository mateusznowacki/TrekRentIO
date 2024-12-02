package pl.pwr.model.Bikes;

import pl.pwr.model.Condition;

public class CargoBike extends Bike{
    private double cargoCapacity;
    private boolean hasElectricAssist;
    private String cargoAreaType;
    private boolean hasChildSeat;


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
