import java.util.*;

public class Main {
  public static void main(String[] args) {

  //1 ArrayList Example
  ArrayList<String> name = new ArrayList<>();
    names.add("John");
    names.add("Alice");
    names.add("Bob");

  System.out.println("ArrayList");
    for(String name : names) {
      System.out.println(name);
    }

  //2 HashSet Example
  HashSet<integer> number = new HashSet<>();
    numbers.add(10);
    numbers.add(20);
    numbers.add(30); //duplicate

    System.out.println("\nHashSet:");
    System.out.println(numbers);

    //3 HashMap Example
    HashMap<String, Interger> marks = new HashMap<>();
    marks.put("John", 85);
    marks.put("Alice", 90);

    System.out.println("\nHashMap:");
    for(Map.Entry<String, Integer> entry : marks.entrySet()) {
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }
//4 sorting Custom Object
    ArrayList<Student> students = new ArrayList<>();
    students.add(new Student("John", 75));
    students.add(new Student("Alice", 92));
    students.add(new Student("Bob",60));

    Collections.sort(students);

    System.out.println("\nSorted Students by Marks:");
    for(Srudent s : students) {
      System.out.println(s);
    }
  }
}
      
    
