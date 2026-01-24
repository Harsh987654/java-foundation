class Account {
  private double balance;
  
  public  void setBalance(double b){
    balance = b;
}
public double getBalance() {
  return balance;
}
}
public class EncapsulationDemo{
  public static void main(String[] args){
    Account acc = new Account();
    acc.setBalance(5000);
    System.out.println(acc.getBalance());
  }
}
