public class Teacher extends Person{
  String subject;

public Teacher(String name, String subject){
  super(name);
  this.subject = subject;
}

@Override
  public void display(){
    System.out.println("Name: "+ name + ", Subject: " + subject);
  }
}
