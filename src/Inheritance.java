// Single Inheritance Example
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("Dog eats meat");
    }
}

// Multilevel Inheritance Example
class Vehicle {
    int serialNo;
    void run() {
        System.out.println("Vehicle runs");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car drives");
    }
    void displaySerialNo() {
        System.out.println("Serial No: " + serialNo);
    }
}

class SportsCar extends Car {
    void race() {
        System.out.println("SportsCar races");
    }
}

// Hierarchical Inheritance Example
class Bird {
    void fly() {
        System.out.println("Bird can fly");
    }
}

class Sparrow extends Bird {
    void chirp() {
        System.out.println("Sparrow chirps");
    }
}

class Eagle extends Bird {
    void hunt() {
        System.out.println("Eagle hunts");
    }
}

// Hybrid Inheritance Example (Combination of Hierarchical and Multilevel)
class BirdVehicle extends Bird {
    void run() {
        System.out.println("BirdVehicle runs");
    }
}

class FlyingCar extends BirdVehicle {
    void drive() {
        System.out.println("FlyingCar drives");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        System.out.println("Demonstrating Different Types of Inheritance:");
        
        // Single Inheritance
        System.out.println("\nSingle Inheritance:");
        Dog dog = new Dog();
        dog.eat();
        
        // Multilevel Inheritance
        System.out.println("\nMultilevel Inheritance:");
        SportsCar sportsCar = new SportsCar();
        sportsCar.run();
        sportsCar.drive();
        sportsCar.race();
        
        // Hierarchical Inheritance
        System.out.println("\nHierarchical Inheritance:");
        Sparrow sparrow = new Sparrow();
        Eagle eagle = new Eagle();
        sparrow.fly();
        sparrow.chirp();
        eagle.fly();
        eagle.hunt();
        
        // Hybrid Inheritance
        System.out.println("\nHybrid Inheritance:");
        FlyingCar flyingCar = new FlyingCar();
        flyingCar.fly();
        flyingCar.run();
        flyingCar.drive();
    }
}

//the child class can access the properties of the parent class - can't acces the actual value that cna change by the parent object