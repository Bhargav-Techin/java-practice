package oops;
class Animal {
    void makeSound() {
      System.out.println("Animal sound");
    }
  }
  
  class Dog extends Animal {
    @Override
    void makeSound() {
      System.out.println("Woof!");
    }
  }
  
  class Cat extends Animal {
    @Override
    void makeSound() {
      System.out.println("Meow!");
    }
  }
  
public class RTPolymorphism {
  public static void main(String[] args) {
    Animal animal1 = new Animal();
    animal1.makeSound(); // Prints "Animal sound"
    Animal animal = new Dog();
    animal.makeSound(); // Prints "Woof!"

    animal = new Cat();
    animal.makeSound(); // Prints "Meow!"
  }
}
