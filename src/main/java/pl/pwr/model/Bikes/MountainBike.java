package pl.pwr.model.Bikes;

import pl.pwr.model.Condition;

public class MountainBike extends Bike {

    private int suspensionTravel;
    private boolean hasDropperPost;
    private String terrainType;
    private boolean hasTubelessTires;



    public int getSuspensionTravel() {
        return suspensionTravel;
    }

    public void setSuspensionTravel(int suspensionTravel) {
        this.suspensionTravel = suspensionTravel;
    }

    public boolean isHasDropperPost() {
        return hasDropperPost;
    }

    public void setHasDropperPost(boolean hasDropperPost) {
        this.hasDropperPost = hasDropperPost;
    }

    public String getTerrainType() {
        return terrainType;
    }

    public void setTerrainType(String terrainType) {
        this.terrainType = terrainType;
    }

    public boolean isHasTubelessTires() {
        return hasTubelessTires;
    }

    public void setHasTubelessTires(boolean hasTubelessTires) {
        this.hasTubelessTires = hasTubelessTires;
    }
}
