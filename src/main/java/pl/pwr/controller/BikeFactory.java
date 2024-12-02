package pl.pwr.controller;


import pl.pwr.model.Bikes.*;
import pl.pwr.model.Condition;

public class BikeFactory {
    public Bike createMountainBike(int id, double price, String name, String description, boolean isAvailable, Condition condition,
                                   int suspensionTravel, boolean hasDropperPost, String terrainType, boolean hasTubelessTires,BikeType biketype) {
        MountainBike mountainBike = new MountainBike();
        mountainBike.setId(id);
        mountainBike.setPrice(price);
        mountainBike.setName(name);
        mountainBike.setDescription(description);
        mountainBike.setAvailable(isAvailable);
        mountainBike.setCondition(condition);
        mountainBike.setSuspensionTravel(suspensionTravel);
        mountainBike.setHasDropperPost(hasDropperPost);
        mountainBike.setTerrainType(terrainType);
        mountainBike.setHasTubelessTires(hasTubelessTires);
        return mountainBike;
    }

//    public Bike createRoadBike(int id, double price, String name, String description, boolean isAvailable, Condition condition,
//                               boolean isAeroFrame, double handlebarWidth, double tireWidth, boolean hasIntegratedBrakes,BikeType biketype) {
//        return new RoadBike();
//    }
//
//    public Bike createCityBike(int id, double price, String name, String description, boolean isAvailable, Condition condition,
//                               boolean hasBasket, boolean hasMudguards, boolean isStepThroughFrame, boolean hasKickstand,BikeType biketype) {
//        return new CityBike();
//    }
//
//    public Bike createCargoBike(int id, double price, String name, String description, boolean isAvailable, Condition condition,
//                                double cargoCapacity, boolean hasElectricAssist, String cargoAreaType, boolean hasChildSeat,BikeType biketype) {
//        return new CargoBike();
//    }
//
//    public Bike createElectricBike(int id, double price, String name, String description, boolean isAvailable, Condition condition,
//                                   double batteryCapacity, int motorPower, double range, boolean hasThrottle, BikeType biketype) {
//        return new ElectricBike();
//    };

}
