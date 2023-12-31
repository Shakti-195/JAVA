class Animal {
    void makeSound() {
        System.out.println("Generic animal sound");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of the child class (Cat) and call makeSound()
        Cat cat = new Cat();
        cat.makeSound();

        // Create an object of the child class (Cat) and refer to the parent class (Animal)
        Animal animalRef = new Cat();
        animalRef.makeSound();

        // Create an Animal class reference variable
        Animal anotherAnimalRef = new Animal();
        anotherAnimalRef.makeSound();
    }
}

Output:

Meow
Meow
Generic animal sound
