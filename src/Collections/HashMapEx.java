package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
  public static void main(String args[]) {
    Map<Character, Integer> map = new HashMap<Character, Integer>();
    String str = "Shivani";
    for (int itr = 0; itr < str.length(); itr++) {
      if (map.containsKey(str.charAt(itr))) {
        map.put(str.charAt(itr), map.get(str.charAt(itr)) + 1);
      } else {
        map.put(str.charAt(itr), 1);
      }
    }
    for (Map.Entry m : map.entrySet()) {
      System.out.println(m.getKey() + " " + m.getValue());
    }
  }
}

//HashMap<Character, Integer> hash_map = new HashMap<>();
//    char[] strArray = inputString.toCharArray();
//    for (char ch : strArray) {
//      if (hash_map.containsKey(ch)) {
//        hash_map.put(ch, hash_map.get(ch) + 1);
//      }
//      else {
//        hash_map.put(ch, 1);
//      }
//    }
//    // Print the hashmap object which gives the number of each character in String.
//    System.out.println(hash_map);
//  }