public class Account {
  //variables
  private int accountNumber;
  private double balance;
  public static final double NEW_BALANCE = 0.0;

  //constructors overloaded
  public Account(int accountNumber, double balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  public Account(int accountNumber) {
    this.accountNumber = accountNumber;
    this.balance = NEW_BALANCE;
  }

  //methods
  public int getAccountNumber() {
    return this.accountNumber;
  }

  public double getBalance() {
    return this.balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void credit(double amount) {
    this.balance += amount;
  }

  public void debit(double amount) {
    if (balance < amount) {
      System.out.println("Amount exceeds current balance!");
    } else {
      this.balance -= amount;
    }
  }

  public String toString() {
    return "Account[A/C #=" + this.accountNumber + ", balance=$" + this.balance + "]";
  }

}
