package pl.pwr.controller;

import pl.pwr.model.Bikes.BikeType;
import pl.pwr.view.ConsolePrinter;
import pl.pwr.view.UserInputHandler;

public class EquipmentController {
    ConsolePrinter consolePrinter = new ConsolePrinter();
    UserInputHandler userInputHandler = new UserInputHandler();

    public void manageEquipment() {
        consolePrinter.printEquipmentManageMenu();
        int choice = userInputHandler.getIntInRange("", 1, 4);

        switch (choice) {
            case 1:
                addEquipment();
                break;
            case 2:
                removeEquipment();
                break;
            case 3:
                editEquipment();
                break;
            case 4:
                return;
        }

    }

    private void addEquipment() {
        consolePrinter.printAddEquipmentForm();

        consolePrinter.printGetBikeType();
        BikeType bikeType = userInputHandler.getBikeType();

        consolePrinter.printGetEquipmentName();
        String name = userInputHandler.getString();

        consolePrinter.printGetEquipmentDescription();
        String description = userInputHandler.getString();

        consolePrinter.printgetAvailableQuantity();
        int availableQuantity = userInputHandler.getInt();

        consolePrinter.printGetDailyPrice();
        double price = userInputHandler.getDouble();


    }

    private void removeEquipment() {

    }

    private void editEquipment() {

    }


}
