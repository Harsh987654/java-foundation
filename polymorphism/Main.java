public class Main {
  public static void main(String[] args) {

  Animal dog = new Dog();
    Animal cat = new Cat();

  dog.makeSound();
    cat.makeSound();

  Shape circle = new Circle(5);
    Shape rectangle = new Rectangle(4,6);

  System.out.println("Circle Area: " + circle.calculateArea());
    System.out.println("Rectangle Area: " rectangle.calculateArea());
  }
}
