Class Student {
  int id;
String name;
  void display(){
    System.out.println(id +" "+name);
  }
}

public class ClassAndObject{
  public static void main(String[] args){
    Student s1 = new Student();
    s1.id=101;
    s1.name="Harsh";
    s1.display();
  }
}
