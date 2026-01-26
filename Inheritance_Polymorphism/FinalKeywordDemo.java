class Vehicle{
  final void run(){
    System.out.println("Vehicle is running");
  }
}
class Bike extends Vehicle{
  //void run() // ERROR: cannot override final method
}

public class FinalKeywordDemo{
  public static void main(String[] args){
    Bike b = new Bike();
    b.run();
  }
}
