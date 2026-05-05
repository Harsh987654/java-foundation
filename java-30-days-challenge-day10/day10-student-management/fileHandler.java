import java.io.*;
import java.util.*;

public class FileHandler {
  public static void saveToFile(ArrayList<Student> students) {
    try {
      FileWriter writer = new FileWriter("student.txt");

      for (Student s: students) {
        writer.write(s.toFileString() + "\n");
      }

      writer.close();
      System.out.println("Data saved to file.");

    }catch (IOException e) {
      System.out.println("error saving file.");
    }
  }

  public static ArrayList<Student> loadFromFile() {
    ArrayList<Student> list = new ArrayList<>();

    try {
      File file = new File("students.txt");
      Scanner sc = new Scanner(file);

      while (sc.hasNextLine()) {
        String line = sc.nextLine();
        Sring[] data = line.split(',");

        int id = Integer.parseInt(data[0]);
        String name = data[1];
        int marks = Integer.parseInt(data[2]);

        list.add(new Student(id, name, marks));
      }

    }catch (Exception e) {
      System.out.println("Error loading file.");
    }

  retirn list;
  }
}
