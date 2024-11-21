package Strings;

import java.util.Scanner;

public class StringPractise {
  public static void main(String[] args) {
    String str;
    Scanner scanner=new Scanner(System.in);
    str=scanner.nextLine();
    for (int itr=0; itr< str.length();itr++)
    {
      char ch = (char) (str.charAt(itr)+1);
      System.out.println(ch);
    }
  }
}
