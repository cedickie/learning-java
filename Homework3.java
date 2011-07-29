/**
  *Homework 4, Caroline Dickie, student -5, e-mail cedickie@gmail.com
  *Write two classes that each have a parameterized constructor
  *Usage: java Homework4
*/

class Hello {
  int y;
  
  Hello(int z) {
    y = z;  
  }
}

class Goodbye {
  int q;
  
  Goodbye(int w) {
    q = w;
  }
}
  
class Homework4 {
  public static void main(String[] args) {
    Hello h1 = new Hello(5);
    Goodbye h2 = new Goodbye(6);
    
      System.out.println(h1.y);
      System.out.println(h2.q);
  }
}