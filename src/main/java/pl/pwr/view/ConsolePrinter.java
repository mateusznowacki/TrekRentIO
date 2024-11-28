package pl.pwr.view;

public class ConsolePrinter {

    public void printAddEquipmentForm() {
        System.out.println("=== Formularz dodawania nowego sprzętu ===");
    }

    public void printEquipmentName() {
        System.out.print("Wprowadź nazwę sprzętu: ");
    }

    public void printEquipmentDescription() {
        System.out.print("Wprowadź opis sprzętu: ");
    }

    public void printAvailableQuantity() {
        System.out.print("Wprowadź dostępną ilość sprzętu: ");
    }

    public void printDailyPrice() {
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
}
