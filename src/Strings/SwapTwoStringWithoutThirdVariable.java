package Strings;

import java.util.Scanner;

public class SwapTwoStringWithoutThirdVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Str 1");
        String str1 = scanner.nextLine();
        System.out.println("Str 2");
        String str2 = scanner.nextLine();
        str1 = str1 + str2;
        str2 = str1.substring(0, (str1.length() - str2.length()));
        str1 = str1.substring(str2.length());
        System.out.println("Str 1 is: " + str1);
        System.out.println("Str 2 is: " + str2);
    }
}
