package Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Isomorphic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (isIsomorphic(scanner.nextLine().toLowerCase(), scanner.nextLine().toLowerCase())) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        for (int itr = 0; itr < s.length(); itr++) {
            char char1 = s.charAt(itr);
            char char2 = t.charAt(itr);
            if (map.containsKey(char1)) {
                System.out.println(map.get(char1));
                System.out.println(char2);
                if (map.get(char1) != char2) {
                    return false;
                }
            } else {
                if (set.contains(char2))
                    return false;
                map.put(char1, char2);
                set.add(char2);
            }
        }
        return true;
    }
}
