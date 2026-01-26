public class Teacher extends Person{
  String subject;

Teacher(String name, String subject){
  super(name);
  this.subject = subject;
}

void display(){
  System.out.println("Teacher Name: "+name);
  System.out.println("Subject: " + subject);
}
}
