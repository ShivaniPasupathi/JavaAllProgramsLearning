package Strings;

import java.util.Scanner;

public class AllSubstringOfAString {
  public static void main(String[] args) {
    String string, sub;
    int i, c, length;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a string to print it's all substrings");
    string = in.nextLine();
    length = string.length();
    System.out.println("Substrings of \"" + string + "\" are :-");
    for (c = 0; c < length; c++) {
      for (i = c+1; i <= length ; i++) {
        System.out.println(c + "," + i);
        sub = string.substring(c, i);
        System.out.println(sub);
      }
    }
  }
}
