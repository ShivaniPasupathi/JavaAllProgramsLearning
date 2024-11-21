package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
  public static void main(String args[]) { //Creating HashSet and adding elements
    HashSet<String> set = new HashSet<String>();
    set.add("Rajendra");
    set.add("Ravi");
    set.add("Ravi");
    set.add("Technolamror"); //Traversing elements
    Iterator<String> itr = set.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
  }
}
