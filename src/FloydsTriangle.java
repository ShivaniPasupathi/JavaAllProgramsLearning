import java.util.Scanner;

public class FloydsTriangle {
  public static void main(String[] args) {
    int n, num = 1, row, col;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of rows of floyd's triangle you want");
    n = in.nextInt();
    System.out.println("Floyd's triangle :-");
    for (row = 1; row <= n; row++) {
      for (col = 1; col <= row; col++) {
        System.out.print(col + " ");
      }
      System.out.println();
    }
  }
}
