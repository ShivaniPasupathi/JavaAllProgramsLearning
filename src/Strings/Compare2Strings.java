package Strings;

import java.util.Scanner;

public class Compare2Strings {
    public static void main(String[] args) {

        String s1, s2;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first string");
        s1 = in.nextLine();
        System.out.println("Enter the second string");
        s2 = in.nextLine();
        System.out.println("Comparing " + s1 + " and " + s2
                + " : " + stringCompare(s1, s2));
        if (s1.compareTo(s2) > 0)
            System.out.println("First string is greater than second.");
        else if (s1.compareTo(s2) < 0)
            System.out.println("First string is smaller than second.");
        else
            System.out.println("Both strings are equal.");
    }

    public static int stringCompare(String str1, String str2) {
        int l1 = str1.length();
        int l2 = str2.length();
        int lmin = Math.min(l1, l2);

        for (int i = 0; i < lmin; i++) {
            int str1_ch = (int) str1.charAt(i);
            int str2_ch = (int) str2.charAt(i);

            if (str1_ch != str2_ch) {
                return str1_ch - str2_ch;
            }
        }

        if (l1 != l2) {
            return l1 - l2;
        } else {
            return 0;
        }
    }
}

//    if (s1.compareTo(s2) > 0)
//      System.out.println("First string is greater than second.");
//    else if (s1.compareTo(s2) < 0)
//      System.out.println("First string is smaller than second.");
//    else
//      System.out.println("Both strings are equal.");
