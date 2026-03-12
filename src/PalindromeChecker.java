import java.util.Stack;

class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String word = "madam";

        // Create a stack
        Stack<Character> stack = new Stack<>();

        // Push each character into the stack
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        // Build reversed string by popping from stack
        String reversed = "";

        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        // Compare original and reversed
        if (word.equals(reversed)) {
            System.out.println("The string '" + word + "' is a palindrome.");
        } else {
            System.out.println("The string '" + word + "' is not a palindrome.");
        }

    }
}