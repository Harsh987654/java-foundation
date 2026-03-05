import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

public static void WriteData() {
  try {
    FileWriter writer = new FileWriter("data.txt");

  writer.write("Hello, this is Day 09 Java File Handling.\n");
  writer.write("Learning file operations in Java.");

  writer.close();

  System.out.println("File written successfully.");

  } catch (IOException e) {
    System.out.println("Error writing file.");
  }
}
}
