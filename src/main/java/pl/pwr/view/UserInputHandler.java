package pl.pwr.view;

import java.util.Scanner;

public class UserInputHandler {
    private final Scanner scanner;

    // Konstruktor
    public UserInputHandler() {
        this.scanner = new Scanner(System.in);
    }

    // Pobierz ciąg znaków
    public String getString(String prompt) {
        System.out.print(prompt + ": ");
        return scanner.nextLine().trim();
    }

    // Pobierz liczbę całkowitą z walidacją
    public int getInt(String prompt) {
        while (true) {
            try {
                System.out.print(prompt + ": ");
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Nieprawidłowa liczba całkowita. Spróbuj ponownie.");
            }
        }
    }

    // Pobierz liczbę zmiennoprzecinkową z walidacją
    public double getDouble(String prompt) {
        while (true) {
            try {
                System.out.print(prompt + ": ");
                return Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Nieprawidłowa liczba. Spróbuj ponownie.");
            }
        }
    }

    // Pobierz wartość logiczną (tak/nie)
    public boolean getBoolean(String prompt) {
        while (true) {
            System.out.print(prompt + " (tak/nie): ");
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
            int value = getInt(prompt);
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
}
