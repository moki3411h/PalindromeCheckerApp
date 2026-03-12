public class PalindromeChecker {
    public static void main(String[]  args){
        String word = "madam";
        char[] characters = word.toCharArray();
        int start = 0;
        int end = characters.length -1;
        boolean ispalindrome = true;
        while (start < end){
        if(characters[start] != characters[end]){
              ispalindrome = false;
              break;
        }
        start++;
        end--;
        }
        if (ispalindrome) {
            System.out.println("The string '" + word + "' is a palindrome.");
        }else{
            System.out.println("The string '" + word + "' is not palindrome.");
        }
        }

    }