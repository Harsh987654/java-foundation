public class Student implements Comparable<Student {

private String name;
  private int marks;

public Student(String name, int marks) {
  this.name = name;
  this.marks = marks;
}
  public String getName() {
    return name;
  }

public int getMarks() {
  return marks;
}
  @Override
  public int compareTo(Student other) {
    return this.marks - other.marks; //Sort by marks
  }

  @Override
  public String toString() {
    return name + " - " + marks;
  }
}


    
