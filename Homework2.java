/**
  * Homework, 2, Caroline Dickie, student 05, e-mail cedickie@gmail.com
  * Write a program that uses relational and logical operators 
  * Usage: java Homework2
  * Sample output: (n1 > n2) && b1
  *
  *The Homework2 class is a program that demonstrates that the result of n1 > n2 is false and that n1 > n2 is true.
  */

class Homework2 {
  
  public static void main(String[] args) {
    
    int n1 = 2;
    int n2 = 1;
    boolean b1 = true;
    boolean b2 = false;
    
    if ((n1 > n2) && b2) {
      System.out.println("this won't execute");
    }
    
    if ((n1 > n2) && b1) {
      System.out.println("(n1 > n2) && b1");
    }
    
  }
  
}