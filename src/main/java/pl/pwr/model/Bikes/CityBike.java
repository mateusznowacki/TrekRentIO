package pl.pwr.model.Bikes;

public class CityBike {
    private boolean hasBasket;
    private boolean hasMudguards;
    private boolean isStepThroughFrame;
    private boolean hasKickstand;

    public CityBike(boolean hasBasket, boolean hasMudguards, boolean isStepThroughFrame, boolean hasKickstand) {
        this.hasBasket = hasBasket;
        this.hasMudguards = hasMudguards;
        this.isStepThroughFrame = isStepThroughFrame;
        this.hasKickstand = hasKickstand;
    }

    public CityBike() {
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
