import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Initialize the scanner for user input

        System.out.println("Temperature Converter");
        System.out.println("a. Convert Celsius to Fahrenheit");
        System.out.println("b. Convert Fahrenheit to Celsius");
        System.out.print("Enter your choice (a or b): ");
        
        String choice = scanner.next(); // Read the user's choice

        if (choice.equalsIgnoreCase("a")) {
            System.out.print("Enter the temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit + "°F");

        } else if (choice.equalsIgnoreCase("b")) {
            System.out.print("Enter the temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println("Temperature in Celsius: " + celsius + "°C");

        } else {
            System.out.println("Invalid choice. Please enter 'a' or 'b'.");
        }

        scanner.close(); // Close the scanner to avoid resource leaks
    }
}
