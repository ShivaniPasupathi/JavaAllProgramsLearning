import java.util.Scanner;

public class ReverseNumber {
  public static void main(String[] args) {
    int num, reverse = 0;
    Scanner scanner = new Scanner(System.in);
    Scanner in = new Scanner(System.in);
    num = in.nextInt();
    while (num != 0) {
      reverse = reverse * 10;
      reverse = reverse + num % 10;
      num /= 10;
    }
    System.out.println(reverse);
  }
}
