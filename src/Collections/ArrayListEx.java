package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {
  public static void main(String args[]) {
    // Creating an Array of string type
    ArrayList al = new ArrayList();

    // Adding elements to ArrayList
    // Custom inputs
    al.add("Geeks");
    al.add("Geeks");

    // Here we are mentioning the index
    // at which it is to be added
    al.add(1, "For");

    // Printing all the elements in an ArrayList
    System.out.println(al);
    Iterator<String> iterator = al.iterator();
    while (iterator.hasNext())
    {
      System.out.println(iterator.next());
    }
  }
}
