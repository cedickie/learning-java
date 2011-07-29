/**
 * Homework, 5, Caroline Dickie, student 05, e-mail cedickie@gmail.com
 * Write a program that does something with Strings that you consider
 * useful. use a String method - in addition to or other than length() - on an array of strings. Do this by processing the array of Strings with a for-each loop.
 use two String methods on one or more individual Strings, that is, Strings that are not processed in an array of Strings by a loop, but rather in separate statements.
 *
 * Usage: java Homework5
 * Sample output: Replace prefix Mrs. with Mr.
 *Name: Mr. Wilson
 *Name: Mr. Lincecum
 *Name: Mr. Huff
 *HELLO, HOW ARE YOU?
 *how are you? 
 * The Homework5 class replaces all instances of string "Mrs." with string "Mr." It also changes the characters in 
 *str2 from upper to lower case and prints the specified substring.
 * 
 */
class Homework5{
  public static void main(String[] args) {
    System.out.println("Replace prefix Mrs. with Mr.");

    String[] names = {"Mrs. Wilson", "Mrs. Lincecum", "Mrs. Huff"};
    String str1;
    
    for (String s: names) {
      str1 = s.replace("Mrs.", "Mr.");
      System.out.println("Name: " + str1);
    }
  
    String str2 = "HELLO, HOW ARE YOU?";
    System.out.println(str2);
    
    str2 = str2.toLowerCase();
    str2 = str2.substring(7);
    System.out.print(str2);

    // LINE IS A NOOB
  }
}
