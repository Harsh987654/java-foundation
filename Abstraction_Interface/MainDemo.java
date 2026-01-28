public class MainDemo {
  public static void main(String[] args) {
    Shape s1 = new Circle(5);
    Shape s2 = new Rectangle(4, 6);

  System.out.println(s1.area());
    System.out.println(s2.area());

  Payment p = new UpiPayment();
    p.pay(500);
    p.receipt();
  }
}
