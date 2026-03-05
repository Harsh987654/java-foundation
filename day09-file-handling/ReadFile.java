import java.io.File;
import java.io.util.Scanner;

public class ReadFile {

public static void readData(() {
  try { 
  File file = new File("data.txt");

  Scanner sc = new Scanner(file);

  while (sc.hasNextLine()) {
    String line = sc.nextLine();
    System.out.println(line);
  }

  sc.close();

  } catch (Exception e) {
    System.out.println("Error reading file.");
  }
}
}
