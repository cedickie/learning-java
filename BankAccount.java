class BankAccount
{
      BankAccount(String name, int wealth)
      {
        System.out.println(wealth);
      }
      //method definition
      void myMethod()
      {
          System.out.println("inside myMethod");
      }
      
      public static void main(String[] args) {
        /*BankAccount account1 - new BankAccount();
        account1.myMethod(); //mehthod call */
        
        new BankAccount (17, "Bill Gates").myMethod();
      }
}