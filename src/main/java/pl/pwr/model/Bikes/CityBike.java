package pl.pwr.model.Bikes;

import pl.pwr.model.Condition;

public class CityBike extends Bike {
    private boolean hasBasket;
    private boolean hasMudguards;
    private boolean isStepThroughFrame;
    private boolean hasKickstand;


    public CityBike() {
        super();
    }

    public boolean isHasBasket() {
        return hasBasket;
    }

    public void setHasBasket(boolean hasBasket) {
        this.hasBasket = hasBasket;
    }

    public boolean isHasMudguards() {
        return hasMudguards;
    }

    public void setHasMudguards(boolean hasMudguards) {
        this.hasMudguards = hasMudguards;
    }

    public boolean isStepThroughFrame() {
        return isStepThroughFrame;
    }

    public void setStepThroughFrame(boolean stepThroughFrame) {
        isStepThroughFrame = stepThroughFrame;
    }

    public boolean isHasKickstand() {
        return hasKickstand;
    }

    public void setHasKickstand(boolean hasKickstand) {
        this.hasKickstand = hasKickstand;
    }
}
