interface A {
  default void show(){
    System.out.println("A show");
  }
}

interface B {
  default void show(){
    System.out.println("B show");
  }
}

public class MultipleInheritanceDemo implements A, B {
  public void show(){
    A.super.show(); //resolve conflict
  }

public static void main(String[] args){
  new MultipleInheritanceDemo().show ();
}
}
