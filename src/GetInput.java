import java.util.Scanner;

public class GetInput {
  public static void main(String[] args) {
    int number;
    float points;
    String name;

    Scanner scanner = new Scanner(System.in);

    name=scanner.nextLine();
    System.out.println("Name is: " + name);

    number=scanner.nextInt();
    System.out.println("Number is: " + number);

    points=scanner.nextFloat();
    System.out.println("Points is: " + points);
  }
}
