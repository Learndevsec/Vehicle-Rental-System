// Parent class - Inheritance base
public class Vehicle {
    // Attributes
    private String vehicleId;
    private String brand;
    private String model;
    private boolean isAvailable;
    
    // Constructor
    public Vehicle(String vehicleId, String brand, String model) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.model = model;
        this.isAvailable = true; // Initially available
    }
    
    // Getters
    public String getVehicleId() {
        return vehicleId;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public String getModel() {
        return model;
    }
    
    public boolean isAvailable() {
        return isAvailable;
    }
    
    // Setter for availability
    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }
    
    // Method to calculate rental (to be overridden)
    public double calculateRental(int duration) {
        return 0.0;
    }
    
    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }
}