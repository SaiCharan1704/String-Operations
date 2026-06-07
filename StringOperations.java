package javacalculator;

import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Palindrome Check
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        if (str.equalsIgnoreCase(reversed)) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is not a Palindrome.");
        }

        // Vowel Count
        int count = 0;

        String lowerStr = str.toLowerCase();

        for (int i = 0; i < lowerStr.length(); i++) {
            char ch = lowerStr.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Number of vowels: " + count);

        sc.close();
    }
}