// Superclass
class Animal {
    // Method to be overridden
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

// Subclass
class Dog extends Animal {
    // Overriding the makeSound() method
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

// Main class with the main method
public class AnimalSound {
    public static void main(String[] args) {
        Dog myDog = new Dog(); // Creating Dog object
        myDog.makeSound(); // Calling overridden method
    }
}
