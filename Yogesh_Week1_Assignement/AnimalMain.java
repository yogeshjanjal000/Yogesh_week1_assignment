// Abstract class Animal
abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void sound();

    // Concrete method (has a body)
    public void sleep() {
        System.out.println("This animal is sleeping.");
    }
}

// Interface Pet
interface Pet {
    // Abstract method (implicitly public and abstract)
    void play();

    // Default method with a body (added in Java 8)
    default void care() {
        System.out.println("This pet needs care.");
    }
}

// Derived class Dog that extends Animal and implements Pet
class Dog extends Animal implements Pet {

    // Implementing the abstract method from Animal
    @Override
    public void sound() {
        System.out.println("The dog barks.");
    }

    // Implementing the abstract method from Pet
    @Override
    public void play() {
        System.out.println("The dog is playing fetch.");
    }
}

// Derived class Cat that extends Animal and implements Pet
class Cat extends Animal implements Pet {

    // Implementing the abstract method from Animal
    @Override
    public void sound() {
        System.out.println("The cat meows.");
    }

    // Implementing the abstract method from Pet
    @Override
    public void play() {
        System.out.println("The cat is playing with a ball of yarn.");
    }
}

// Main class to demonstrate abstract classes and interfaces
public class AnimalMain {
    public static void main(String[] args) {
        // Creating objects of Dog and Cat
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Using methods from the abstract class Animal
        dog.sound();  // The dog barks.
        dog.sleep();  // This animal is sleeping.
        cat.sound();  // The cat meows.
        cat.sleep();  // This animal is sleeping.

        // Using methods from the interface Pet
        dog.play();   // The dog is playing fetch.
        dog.care();   // This pet needs care.
        cat.play();   // The cat is playing with a ball of yarn.
        cat.care();   // This pet needs care.
    }
}
