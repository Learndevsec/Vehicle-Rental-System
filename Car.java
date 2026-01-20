// Child class - Inheritance
public class Car extends Vehicle {
    // Additional attributes
    private double dailyRate;
    private int seatingCapacity;
    
    // Constructor
    public Car(String vehicleId, String brand, String model, 
               double dailyRate, int seatingCapacity) {
        super(vehicleId, brand, model); // Call parent constructor
        this.dailyRate = dailyRate;
        this.seatingCapacity = seatingCapacity;
    }
    
    // Getters
    public double getDailyRate() {
        return dailyRate;
    }
    
    public int getSeatingCapacity() {
        return seatingCapacity;
    }
    
    // Override rental calculation (days)
    @Override
    public double calculateRental(int days) {
        return dailyRate * days;
    }
    
    // Override display method
    @Override
    public void displayDetails() {
        System.out.println("\n===== Car Details =====");
        super.displayDetails();
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Daily Rate: $" + dailyRate);
        System.out.println("=======================\n");
    }
}