Real-World Problem Statement
A vehicle rental company rents out cars and bikes. Each vehicle type has different rental rates and features. Cars are charged per day, while bikes are charged per hour. The system should calculate rental costs and display vehicle details.

OOP Concepts Used
Inheritance: Base Vehicle class with Car and Bike subclasses
Encapsulation: Private fields with controlled access
Polymorphism: Different rental calculation methods
Class Design
Class	Responsibility
Vehicle (Parent)	Base class with common vehicle attributes
Car	Calculate rental for cars (daily rate)
Bike	Calculate rental for bikes (hourly rate)
RentalSystem	Main class to run the application