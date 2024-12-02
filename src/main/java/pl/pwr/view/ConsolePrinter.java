package pl.pwr.view;

public class ConsolePrinter {

    public void printAddEquipmentForm() {
        System.out.println("=== Formularz dodawania nowego sprzętu ===");
    }

    public void printGetEquipmentName() {
        System.out.print("Wprowadź nazwę sprzętu: ");


    }  public void printGetBikeType() {
        System.out.print("Wprowadź typ roweru: CITY, MOUNTAIN, ROAD, ELECTRIC");
    }

    public void printGetEquipmentDescription() {
        System.out.print("Wprowadź opis sprzętu: ");
    }

    public void printgetAvailableQuantity() {
        System.out.print("Wprowadź dostępną ilość sprzętu: ");
    }

    public void printGetDailyPrice() {
        System.out.print("Wprowadź cenę za dobę: ");
    }

    public void printDataValid() {
        System.out.println("Wszystkie dane zostały poprawnie wprowadzone.");
    }

    public void printDataInvalid() {
        System.out.println("Wprowadzone dane są nieprawidłowe. Spróbuj ponownie.");
    }

    public void printEquipmentAdded() {
        System.out.println("Nowy sprzęt został pomyślnie dodany do bazy danych.");
    }

    public void printAddEquipmentError() {
        System.out.println("Wystąpił błąd podczas dodawania sprzętu. Skontaktuj się z administratorem systemu.");
    }

    public void printReturnToManagementPanel() {
        System.out.println("Powrót do panelu zarządzania sprzętem.");
    }

    public void printWelcomeMessage() {
        System.out.println("Witaj w systemie wypożyczalni sprzętu sportowego!");
        System.out.println("Wybierz jedną z poniższych opcji:");
        System.out.println("1. Zarządzanie sprzętem");
        System.out.println("2. Wypożycz sprzęt");
        System.out.println("3. Zarządzanie wypożyczeniami");
        System.out.println("4. Wyjście");
    }

    public void printEquipmentManageMenu() {
        System.out.println("Wybierz jedną z poniższych opcji:");
        System.out.println("1. Dodaj nowy sprzęt");
        System.out.println("2. Edytuj sprzęt");
        System.out.println("3. Usuń sprzęt");
        System.out.println("4. Powrót");
    }
}
