
/**
*Class used to create BankLoan objects.
*/

public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;
   private static int loansCreated = 0;

   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;
   
/**
*Constructor used to create a new BankLoan object.
*@param customerNameIn sets the customer's name
*@param interestRateIn sets the customer's interest rate
*The method also sets the balance variable of the loan to '0' and 
*increments the number of loans created.
*/
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }
   
/**
*Determines if the cutomer was approved for a loan.
*@param amount is the amount borrowed.
*@return returns true if the loan was made
*/
   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }

/**
*Determines new loan balance after a payment.
*@param amountPaid the amount paid to the bank
*@return returns the amount to be paid back to customer, if any
*/

   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
   
   /**
   *Getter method to return the current balance.
   @return is the current balance
   */
   
   public double getBalance() {
      return balance;
   }
   
   /**
   *Setter method for interest rate.
   @param interestRateIn is the new intereste rate to be set
   @return describes if the new rate was set 
   */
   
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
   
   /**
   *Getter method for the current interest rate.
   *@return returns the current interest rate
   */
   
   public double getInterestRate() {
      return interestRate;
   }
   
   /**
   *Determines the amount of interest to be charged.
   */
   
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
   
   /**
   *Returns current information about the customer.
   @return outputs the customer's name, interest rate, and balance.
   */
   
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }
   
   /**
   *Determines if the amount of the loan is valid.
   @param amount is the loan amount
   @return tells us if the loan is valid or not
   */
   
   public static boolean isAmountValid(double amount) {
      if (amount >= 0) {
         return true;
      }
      return false;
   }
   
   /**
   *Tells us if the customer is currently in debt.
   @param loan is the current bank loan
   @return returns whether or not the user is in debt
   */
   
   public static boolean isInDebt(BankLoan loan) {
      if (loan.getBalance() > 0) {
         return true;
      }
      return false;
   }
   
   /**
   *Getter method of the count of loans created.
   *@return is the number of loans created
   */
   
   public static int getLoansCreated() {
      return loansCreated;
   }
   
   /**
   *Resets the number of created loans to 0.
   */
   
   public static void resetLoansCreated() {
      loansCreated = 0;
   }

}
