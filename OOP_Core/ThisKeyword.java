class Student {
  int id;
  String name;
  Student(int id, String name ){
    this.id = id;
    this.name = name;
  }
}
public class ThisKeyword{
  public static void main(String[] args){
    Student s= new Student(103, "AI Researcher");
    System.out.println(s.id +" " +s.name);
  }
}
