// BankAccount class created
public class BankAccount {
    // attributes included: (double) checking balance and savings balance
    private static double checkingBalance;
    private static double savingsBalance;

    // static class member keeps track of number of accounts
    private static int numberOfAccounts;

    // static class member keeps track of the total of all accounts;
    private static double total;

    // constructor increments the number of accounts;
    public BankAccount() {
        numberOfAccounts++;
    }

    // getter method returns amount in checking
    public double getCheckingBalance () {
        return this.checkingBalance;
    }

    // getter method returns amount in savings
    public double getSavingsBalance () {
        return this.savingsBalance;
    }

    // deposit setter method adds to which ever account specified as well as to total
    public void deposit(double amount,String account) {
        if(account.indexOf("che") >= 0) {
            this.checkingBalance += amount;
            this.total += amount;
        }
        else if(account.indexOf("sav") >= 0) {
            this.savingsBalance += amount;
            this.total += amount;
        }
    }

    // withdraw setter method takes away from which ever account specified as well as from the total
    public void withdraw(double amount, String account) {
        if((account.indexOf("che") >= 0) && (this.checkingBalance > amount)) {
            this.checkingBalance -= amount;
            this.total -= amount;
        }
        else if((account.indexOf("sav") >= 0) && (this.savingsBalance > amount)) {
            this.savingsBalance -= amount;
            this.total -= amount;
        }
        else {
            System.out.println("Insufficent funds.");
        }
    }

    // get total method returns total 
    public double getTotal() {
        return this.total;
    }
}