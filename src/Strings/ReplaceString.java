package Strings;

public class ReplaceString {
  public static void main(String args[]) {
    String s1 = "My name is Rajendra. My name is lamror. My name is Technolamror.";
    String replaceString=s1.replaceAll("is", "was");//replaces all occurrences of "is" to "was"
    System.out.println(replaceString);
    StringBuffer str =
        new StringBuffer("My name is Rajendra. My name is lamror. My name is Technolamror.");
    str.replace(0, 2, "No");
    System.out.println(str);
  }
}
