class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string with spaces and mixed case
        String word = "Madam In Eden Im Adam";

        // Normalize string: remove spaces and convert to lowercase
        String normalized = word.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = true;

        int start = 0;
        int end = normalized.length() - 1;

        // Check palindrome
        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Print result
        if (isPalindrome) {
            System.out.println("The string '" + word + "' is a palindrome (ignoring spaces and case).");
        } else {
            System.out.println("The string '" + word + "' is not a palindrome.");
        }
    }
}