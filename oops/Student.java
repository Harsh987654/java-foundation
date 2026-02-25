public class Studennt{
  private String name :
  private int age;

  //Constuctor
public Student(String name, int age){
  this.name = name;
  this.age=age;
}

//Getter
public String getName() {
  return name;
}
  //Setter
public void setAge(int age) {
  if(age>0){
    this.age =age;
  }
}

public void display(){
  System.out.println("Name:" +",Age: " + age);
}
}
