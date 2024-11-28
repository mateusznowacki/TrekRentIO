package pl.pwr.model.Bikes;

import pl.pwr.model.Condition;

public class ElectricBike  extends Bike {
    private double batteryCapacity;
    private int motorPower;
    private double range;
    private boolean hasThrottle;

    public ElectricBike() {

    }

    public ElectricBike(int id, double price, String name, String description, boolean isAvailable, Condition condition,
                        double batteryCapacity, int motorPower, double range, boolean hasThrottle) {
        super(id, price, name, description, isAvailable, condition);
        this.batteryCapacity = batteryCapacity;
        this.motorPower = motorPower;
        this.range = range;
        this.hasThrottle = hasThrottle;
    }

    public ElectricBike(double batteryCapacity, int motorPower, double range, boolean hasThrottle) {
        this.batteryCapacity = batteryCapacity;
        this.motorPower = motorPower;
        this.range = range;
        this.hasThrottle = hasThrottle;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getMotorPower() {
        return motorPower;
    }

    public void setMotorPower(int motorPower) {
        this.motorPower = motorPower;
    }

    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
    }

    public boolean isHasThrottle() {
        return hasThrottle;
    }

    public void setHasThrottle(boolean hasThrottle) {
        this.hasThrottle = hasThrottle;
    }
}
