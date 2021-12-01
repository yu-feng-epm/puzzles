/**
 * Question:
 * Given a string s, determine if it is a palindrome, considering only 
 * alphanumeric characters and ignoring cases.
 */
public class LeetCode125 {
  public static boolean isAlphaNumeric(char c) {
    return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <='9');
  }

  public static boolean isPalindrome(String s1) {
    System.out.println("Input: " + s1);
    String s = "";
    for (int i = 0; i < s1.length(); i++) {
      char c = s1.charAt(i);
      if (isAlphaNumeric(c)) {
        s += c;
      }
    }
    
    s = s.toLowerCase();
    
    for (int i = 0; i < s.length()/2; i++) {
      if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
        System.out.println("False. Explanation: " + s + " is not a palindrome.");
        return false;
      }
    }
    
    System.out.println("True. Explanation: " + s + " is a palindrome.");
    return true;
  }

  public static void main(String[] args) {
    isPalindrome("A man, a plan, a canal: Panama");
    isPalindrome("race a car");
  }
}
