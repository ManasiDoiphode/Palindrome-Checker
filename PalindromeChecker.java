import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter a word or phrase (or type 'exit' to quit): ");
            String input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program.");
                break;
            }
            
            if (isPalindrome(input)) {
                System.out.println("The given input is a palindrome.");
            } else {
                System.out.println("The given input is not a palindrome.");
            }
        }
        
        scanner.close();
    }

    /**
     * Checks whether a given string is a palindrome.
     * Ignores case while comparing characters for efficiency.
     * 
     * @param str The input string to check.
     * @return true if the string is a palindrome, false otherwise.
     */
    private static boolean isPalindrome(String str) {
        StringBuilder cleanedStr = new StringBuilder();
        
        for (char ch : str.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                cleanedStr.append(Character.toLowerCase(ch));
            }
        }

        return cleanedStr.toString().equals(cleanedStr.reverse().toString());
    }
}