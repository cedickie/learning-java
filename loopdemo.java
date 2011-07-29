class loopdemo{
  public static void main(String[] args) throws java.io.IOException {
    int x, answer = '6';
    
    do {
      System.out.println("x is a number between 1 and 10");
      System.out.println("what will the number be?");
    
      do {
        for (x = 0; x < answer; x++) {
          if (x == 1) {
            System.out.println ("x is one");
          } else if (x == 2) {
            System.out.println("x is two");
          } else {
            System.out.println("x is not between one and five");
            break;
          }
        }
      } while (answer < x);
      
      //do {
      for (x = 10; x > 5; x--) {
          if (x > 6) {
            System.out.println("x is greater than five");
          } else if (x == 6) { 
            System.out.println("x is six!");
            break;
          }
        }
      //} while (answer >= x);
        
          
    } while (false); 
  }
}
