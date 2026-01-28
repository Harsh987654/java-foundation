public interface Payment{
  void pay(double amount);
  default void receipt(){
    System.out.println("Payment successful");
  }
}
