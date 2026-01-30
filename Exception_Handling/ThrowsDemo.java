import java.io.*;
public class ThrowsDemo {
  static void readFile() throw IOException {
    FileReader fr = new FileReader("test.txt");
  }
  public static void main(String[] args) {
    try {
      readFile();
    }
    catch (IOException e) {
      System.out.println("File not found");
    }
  }
}
