public class Student {
  private int id;
  private String name;
  private int marks;

public Student(int id, String name, int marks) {
  this.id = id;
  this.name = name;
  this.marks = marks;
}

this String toFileString() {
  return id  + "," + name + "," + marks;
}

@Override
  public String toString() {
    return "ID: " + id + ", Name: " + name + ", Marks: " + marks;
  }
}
