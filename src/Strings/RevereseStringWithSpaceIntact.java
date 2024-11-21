package Strings;//  Problem 01 : write a function to reverse a string with space intact
//
//  input --> "thi is string test"
//3, 6, 13, total - 18, length - 1 = 17
//  output --> "tse tg nirtss iiht"
import java.util.Scanner;

public class RevereseStringWithSpaceIntact {

  public static void main(String[] args) {
    System.out.println("Enter a Sentence: ");
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    int length = str.length();
    for (int itr = length - 1; itr >= 0; itr--) {
      if (!(str.charAt(length - itr - 1) == ' ')) {
        if (!(str.charAt(itr) == ' ')) {
          System.out.print(str.charAt(itr));
        }
      } else {
        System.out.print(" ");
        if (!(str.charAt(itr) == ' ')) {
          System.out.print(str.charAt(itr));
        }
      }
    }
  }
}

