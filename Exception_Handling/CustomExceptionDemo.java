public class CustomExceptionDemo {
  static void ValidateAge(int age) throw InvalidAgeException {
    if (age < 18) {
      throw new InvalidAgeException("Age must be 18 or above");
    }
    System.out.prinln("valid age");
  }
  public static void main(String[] args) {
    try {
      validateAge(15);
    }
    catch(InvalidAgeException e) {
      System.out.println(e.getMessage());
    }
  }
}
