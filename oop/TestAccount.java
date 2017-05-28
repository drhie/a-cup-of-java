import java.util.*;

public class TestAccount {

  public void testStates(Account a) {
    System.out.println(a);
    System.out.println("The account number is: " + a.getAccountNumber());
    System.out.println("The balance is: " + a.getBalance());
  }

  public static void main (String[] args) {
    TestAccount test = new TestAccount();
    //Test Constructors and toString()
    Account a1 = new Account(1234, 99.99);
    System.out.println(a1);
    Account a2 = new Account(8888);
    System.out.println(a2);

    //Test Setters and Getters
    a1.setBalance(88.88);
    test.testStates(a1);
    //Test credit() and debit()
    a2.credit(100);
    test.testStates(a2);
    a2.debit(20);
    test.testStates(a2);
    a2.debit(300); //Get debit error.
    test.testStates(a2);
  }
}
