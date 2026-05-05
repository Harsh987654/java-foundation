import java.util.ArrayList;

public class StudentManager {
  private ArrayList<Student> students = new ArrayList<>();
  public void addStudent(Student s) {
    students.add(s);
  }

public void displayStudent() {
  for (Student s : students) {
    System.out.println(s);
  }
}

public ArrayList<Student> getStudents() {
  return students;
}
}
