// logic for withdrawing, deposit, checking balance, view previous transaction and calculate interest
// TODO Arraylist for transaction history

public final class TransactionData {
    private int balance;
    private int previousTransaction;

    public TransactionData(int balance, int previousTransaction) {
        this.balance = balance;
        this.previousTransaction = previousTransaction;
    }

    public int getBalance() {
        return balance;
    }

    public void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        } else {
            System.out.println("No transaction occurred");
        }
    }

    public void deposit(int amount) {
        if (amount != 0) {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    public void withdraw(int amount) {
        if (amount != 0) {
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }


}
