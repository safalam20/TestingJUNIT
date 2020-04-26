import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private String firstName;
    private String lastName;
    private double balance;
    private List<Double> depositRecords;

    public BankAccount(String firstName, String lastName, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        depositRecords=new ArrayList<>();
    }

    // The branch argument is true if the customer is performing the transaction
    // at a branch, with a teller.
    // It's false if the customer is performing the transaction at an ATM
    public double deposit(double amount, boolean branch) {
        balance += amount;
        depositRecords.add(amount);
        return balance;
    }

    // The branch argument is true if the customer is performing the transaction
    // at a branch, with a teller.
    // It's false if the customer is performing the transaction at an ATM
    public double withdraw(double amount, boolean branch) {
        if (amount>=500.0 && !branch){
            throw new IllegalArgumentException();
        }
        balance -= amount;
        return balance;
    }

    public double getBalance() {
        return balance;
    }
    public List<Double> getDepositRecords(){return depositRecords;}


    // More methods that use firstName, lastName, and perform other functions
}
