package pl.pwr;

import pl.pwr.controller.EquipmentController;
import pl.pwr.view.ConsolePrinter;
import pl.pwr.view.UserInputHandler;

public class Main {
    public static void main(String[] args) {

        ConsolePrinter consolePrinter = new ConsolePrinter();
        UserInputHandler userInputHandler = new UserInputHandler();
        EquipmentController equipmentController = new EquipmentController();


        while (true) {
            consolePrinter.printWelcomeMessage();
            int choice = userInputHandler.getIntInRange("",1,4);
            switch (choice) {
                case 1:
                    equipmentController.manageEquipment();

           //
                    break;
                case 2:
                   //
                    break;
                case 3:
                  //
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }








    }




}