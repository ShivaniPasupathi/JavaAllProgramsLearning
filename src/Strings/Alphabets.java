package Strings;

public class Alphabets {
  public static void main(String[] args) {
    char ch;
    for (ch = 'a'; ch <= 'z'; ch++) {
      char charOne = (char) (ch + 1);
      System.out.println(ch);
      System.out.println(charOne);
    }
  }
}
