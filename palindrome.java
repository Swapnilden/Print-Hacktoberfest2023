public class Palindrome {
    public static void main(String[] args) {
        String str = "radar"; // Change this to test different strings
        boolean isPalindrome = checkPalindrome(str);

        System.out.println(str + " is " + (isPalindrome ? "a palindrome" : "not a palindrome"));
    }

    public static boolean checkPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }
}
