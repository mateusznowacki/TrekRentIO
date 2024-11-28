package pl.pwr.model;

import pl.pwr.model.Bikes.BikeType;

public class StockLevel {
    private int id;
    private int availableCount;
    private BikeType bikeType;

    public StockLevel(int id, int availableCount, BikeType bikeType) {
        this.id = id;
        this.availableCount = availableCount;
        this.bikeType = bikeType;
    }

    public BikeType getBikeType() {
        return bikeType;
    }

    public void setBikeType(BikeType bikeType) {
        this.bikeType = bikeType;
    }

    public int getAvailableCount() {
        return availableCount;
    }

    public void setAvailableCount(int availableCount) {
        this.availableCount = availableCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
