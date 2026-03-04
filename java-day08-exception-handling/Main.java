import java.util.Scanner;
public class Main {
  public static void checkAge(int age) throws InvalidAgeException {
    it(age < 18) {
      throw new InvalidAgeException("You must be 18+ to register");
    } else {
      System.out.println("Registration successful!");
    }
  } 

public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  try {
       System.out.print("Entrer your age: ");
    int age = sc.nextInt();

    checkAge(age);

  int result = 10/0;
    System.out.println(result);

  }catch (InvalidAgeException e) {
    System.out.println("Custom Exception: " + e.getMessage());

  } catch (ArithmeticException e) {
    System.out.println("Math Error: Cannot divide by zero.");

  } catch (Exception e) {
    System.out.println("General Exception occured.");
  } finally { 
  System..out.println("Execution Completed.");
  }

  sc.close();
}
}
