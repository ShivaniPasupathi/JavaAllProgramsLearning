public class Finally {
  public static int finallyEx(int a, int b) {
    try {
      int result = a / b;
      System.out.println("Result = " + result);
      return result;
    } catch (ArithmeticException e) {
      System.out.println("Exception caught: Division by zero.");
      return 0;
    } finally {
      System.out.println("finally block will execute always.");
    }
  }
}
