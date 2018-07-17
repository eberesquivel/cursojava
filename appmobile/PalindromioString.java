public class PalindromioString{
 
    public static void main(String[] args) {
       String input = "pendejo";
        
       // Loop through an array of Strings,
       // testing if each is a Palindrome or not
       // Test if next string is a palindrome
           
          boolean palindrome = isPalindrome(input);
          if (palindrome) {
             System.out.println(input+" is a palindrome");
          } else {
             System.out.println(input+" is not a palindrome");           
          }
       
    }
     
    /**
     * Test whether a given String is a Palindrome or not
     * @param s the String to test
     * @return true is String is a palindrome, false otherwise
     */
     
    public static boolean isPalindrome(String s) {
        
       // Start two indexes
       // One from left side of string
        
       int left = 0;
        
       // And the other from right side
        
       int right = s.length() - 1;
        
       // Now compare characters from the outside in
       //. Once we get to the middle we can stop
        
       while (left<right) {
           
          // Compare characters
           
          if (s.charAt(left)!=s.charAt(right)) {
              
             // They are different so its not a palindrome
              
             return false;
          }
           
          // test the next characters in
           
          left++;
          right--;
       }
        
       // All the characters matched so it must be a palindrome
        
       return true;
    }
 }