import java.util.Scanner;

public class RentalSystem {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("===== Vehicle Rental System =====\n");
        
        // Create vehicles
        Car car1 = new Car("C001", "Toyota", "Camry", 50.0, 5);
        Car car2 = new Car("C002", "Honda", "Civic", 45.0, 5);
        Bike bike1 = new Bike("B001", "Trek", "Mountain X", 10.0, "Mountain");
        Bike bike2 = new Bike("B002", "Giant", "Road Pro", 8.0, "Road");
        
        // Display available vehicles
        System.out.println("Available Vehicles:\n");
        car1.displayDetails();
        car2.displayDetails();
        bike1.displayDetails();
        bike2.displayDetails();
        
        // Rent a car
        System.out.println("===== Rent a Car =====");
        System.out.print("Enter number of days: ");
        int days = scanner.nextInt();
        
        double carRental = car1.calculateRental(days);
        System.out.println("\nRental Cost for " + car1.getBrand() + " " + 
                          car1.getModel() + " (" + days + " days): $" + carRental);
        car1.setAvailable(false);
        
        // Rent a bike
        System.out.println("\n===== Rent a Bike =====");
        System.out.print("Enter number of hours: ");
        int hours = scanner.nextInt();
        
        double bikeRental = bike1.calculateRental(hours);
        System.out.println("\nRental Cost for " + bike1.getBrand() + " " + 
                          bike1.getModel() + " (" + hours + " hours): $" + bikeRental);
        bike1.setAvailable(false);
        
        // Total rental
        System.out.println("\n===================================");
        System.out.println("Total Rental Cost: $" + (carRental + bikeRental));
        System.out.println("===================================");
        
        scanner.close();
    }
}