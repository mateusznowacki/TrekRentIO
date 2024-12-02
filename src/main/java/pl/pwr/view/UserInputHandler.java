package pl.pwr.view;

import pl.pwr.model.Bikes.BikeType;

import java.util.Scanner;

public class UserInputHandler {
    private final Scanner scanner;

    // Konstruktor
    public UserInputHandler() {
        this.scanner = new Scanner(System.in);
    }

    // Pobierz ciąg znaków
    public String getString() {

        return scanner.nextLine().trim();
    }

    // Pobierz liczbę całkowitą z walidacją
    public int getInt( ) {
        while (true) {
            try {

                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Nieprawidłowa liczba całkowita. Spróbuj ponownie.");
            }
        }
    }

    // Pobierz liczbę zmiennoprzecinkową z walidacją
    public double getDouble( ) {
        while (true) {
            try {

                return Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Nieprawidłowa liczba. Spróbuj ponownie.");
            }
        }
    }

    // Pobierz wartość logiczną (tak/nie)
    public boolean getBoolean( ) {
        while (true) {

            String input = scanner.nextLine().trim().toLowerCase();
            if (input.equals("tak")) {
                return true;
            } else if (input.equals("nie")) {
                return false;
            } else {
                System.out.println("Nieprawidłowa odpowiedź. Wpisz 'tak' lub 'nie'.");
            }
        }
    }

    // Pobierz wybór z ograniczonej listy opcji
    public String getChoice(String prompt, String[] options) {
        while (true) {
            System.out.print(prompt + " (" + String.join("/", options) + "): ");
            String input = scanner.nextLine().trim();
            for (String option : options) {
                if (input.equalsIgnoreCase(option)) {
                    return option;
                }
            }
            System.out.println("Nieprawidłowa opcja. Wybierz jedną z: " + String.join(", ", options));
        }
    }

    // Pobierz liczbę z określonego zakresu
    public int getIntInRange(String prompt, int min, int max) {
        while (true) {
            int value = getInt();
            if (value >= min && value <= max) {
                return value;
            }
            System.out.println("Wartość musi być w zakresie od " + min + " do " + max + ".");
        }
    }

    // Zamknij skaner
    public void close() {
        scanner.close();
    }

    public BikeType getBikeType() {
        while (true) {
            String input = scanner.nextLine().trim().toUpperCase();
            try {
                return BikeType.valueOf(input);
            } catch (IllegalArgumentException e) {
                System.out.println("Nieprawidłowy typ roweru.");
            }
        }
    }
}
