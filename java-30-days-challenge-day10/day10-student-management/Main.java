import java.util.*;
public class Main {

public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  StudentManager manager = new StudentManager();

  while (true) {
    System.out.println("\n1. Add Student");
    System.out.println("2.View Students");
    System.out.println("3. Save to File");
    System.out.println("4. Load from File");
    System.out.println("5. Exit");

    int choice = sc.nextInt();

    switch(choice) {
      case 1:
        System.out.print("Enter ID: ");
        int id  = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        manager.addStudent(new Student(id, name, marks));
        break;

      case 2:
        manager.displayStudent();
        break;

      case 3:
        FileHandler.saveToFile(manager.getStudents());
        break;

      case 4:
        manager = new StudentManager();
        for (Student s : FileHandler.loadFromFile()) {
          manager.addStudent(s);
        }
        break;

      case 5:
        System exit(0);

      default:
        System.out.println("Invalid choice");
    }
  }
}
}
        
