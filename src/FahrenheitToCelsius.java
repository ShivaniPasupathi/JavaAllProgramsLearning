import java.util.Scanner;

public class FahrenheitToCelsius {
  public static void main(String[] args) {
    float fh;
    float c;
    Scanner scanner = new Scanner(System.in);
    fh = scanner.nextFloat();
    c = ((fh-32)*5)/9;
    System.out.println("Celsius: " + c);
  }
}

