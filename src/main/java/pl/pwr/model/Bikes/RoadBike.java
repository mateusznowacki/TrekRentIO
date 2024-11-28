package pl.pwr.model.Bikes;

import pl.pwr.model.Condition;

public class RoadBike extends Bike {

    private boolean isAeroFrame;
    private double handlebarWidth;
    private double tireWidth;
    private boolean hasIntegratedBrakes;

    public RoadBike(int id, double price, String name, String description, boolean isAvailable, Condition condition,
                    boolean isAeroFrame, double handlebarWidth, double tireWidth, boolean hasIntegratedBrakes) {
        super(id, price, name, description, isAvailable, condition);
        this.isAeroFrame = isAeroFrame;
        this.handlebarWidth = handlebarWidth;
        this.tireWidth = tireWidth;
        this.hasIntegratedBrakes = hasIntegratedBrakes;
    }

    public RoadBike(boolean isAeroFrame, double handlebarWidth, double tireWidth, boolean hasIntegratedBrakes) {
        this.isAeroFrame = isAeroFrame;
        this.handlebarWidth = handlebarWidth;
        this.tireWidth = tireWidth;
        this.hasIntegratedBrakes = hasIntegratedBrakes;
    }

    public boolean isAeroFrame() {
        return isAeroFrame;
    }

    public void setAeroFrame(boolean aeroFrame) {
        isAeroFrame = aeroFrame;
    }

    public double getHandlebarWidth() {
        return handlebarWidth;
    }

    public void setHandlebarWidth(double handlebarWidth) {
        this.handlebarWidth = handlebarWidth;
    }

    public double getTireWidth() {
        return tireWidth;
    }

    public void setTireWidth(double tireWidth) {
        this.tireWidth = tireWidth;
    }

    public boolean isHasIntegratedBrakes() {
        return hasIntegratedBrakes;
    }

    public void setHasIntegratedBrakes(boolean hasIntegratedBrakes) {
        this.hasIntegratedBrakes = hasIntegratedBrakes;
    }
}