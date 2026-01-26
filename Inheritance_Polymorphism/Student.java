public class Student extends Person{
  int rollNo;

Student(String name, int rollNo){
  super(name);
  this.rollNo = rollNo;
}
  void display(){
    System.out.println("Student Name: " + name);
    System.out.println("Roll No: " + rollNo);
  }
}
    
