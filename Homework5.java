/**
 * Homework, 5, Caroline Dickie, student 05, e-mail cedickie@gmail.com
 * Write a program that does something with Strings that you consider
 * useful
 * Usage: java Homework5
 * Sample output: Replace prefix Mrs. with Mr.
 Name: Mr. Wilson
 Name: Mr. Lincecum
 Name: Mr. Huff
 * 
 * The Homework5 class replaces all instances of string "Mrs." with string "Mr."
 * 
 */
class Homework5{
  public static void main(String[] args) {
    System.out.println("Replace prefix Mrs. with Mr.");
  
  String[] names = {"Mrs. Wilson", "Mrs. Lincecum", "Mrs. Huff"};
    String str;
    
    for (String s: names) {
      str = s.replace("Mrs.", "Mr.");
      System.out.println("Name: " + str);
    }

  }
}
