"""
Question:
Given a string s, determine if it is a palindrome, considering only 
alphanumeric characters and ignoring cases.
"""
def isPalindrome(s1):
  print("Input: " + s1)
  s = ""
  for c in s1:
    if ((c >= 'a' and c <= 'z') or (c >= 'A' and c <= 'Z') or (c >= '0' and c <='9')):
      s += c
  s = s.lower()

  for i in range(0, int(len(s)/2)):
    if s[i] != s[len(s)-1-i]:
      print("False. Explanation: " + s + " is not a palindrome.")
      return
  
  print("True. Explanation: " + s + " is a palindrome.")

isPalindrome("A man, a plan, a canal: Panama")
isPalindrome("race a car")
