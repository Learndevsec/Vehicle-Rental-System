// Child class - Inheritance
public class Bike extends Vehicle {
    // Additional attributes
    private double hourlyRate;
    private String bikeType; // "Mountain", "Road", "Electric"
    
    // Constructor
    public Bike(String vehicleId, String brand, String model,
                double hourlyRate, String bikeType) {
        super(vehicleId, brand, model);
        this.hourlyRate = hourlyRate;
        this.bikeType = bikeType;
    }
    
    // Getters
    public double getHourlyRate() {
        return hourlyRate;
    }
    
    public String getBikeType() {
        return bikeType;
    }
    
    // Override rental calculation (hours)
    @Override
    public double calculateRental(int hours) {
        return hourlyRate * hours;
    }
    
    // Override display method
    @Override
    public void displayDetails() {
        System.out.println("\n===== Bike Details =====");
        super.displayDetails();
        System.out.println("Bike Type: " + bikeType);
        System.out.println("Hourly Rate: $" + hourlyRate);
        System.out.println("========================\n");
    }
}