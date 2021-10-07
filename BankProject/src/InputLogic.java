// logic for input and output.
// TODO change the constructor and have the input logic as a method.

import java.util.Scanner;

public final class InputLogic {
  private static Account savingsAccount1;
  private static TransactionData transData;


  static void InputLogic() {
    new Account("Savings Account", "Woobear", "1337");
    new TransactionData(0, 0);

    char option = '\0';
    Scanner scanner = new Scanner(System.in);
    System.out.println("Welcome, " + savingsAccount1.getCustomerName() + "!");
    System.out.println("Your ID is: " + savingsAccount1.getCustomerId());
    System.out.println("You are viewing your " + savingsAccount1.getAccountName());
    System.out.println();
    System.out.println("What can we do for you today?");
    System.out.println();
    System.out.println("A. Check your balance");
    System.out.println("B. Make a deposit");
    System.out.println("C. Make a withdrawal");
    System.out.println("D. View previous transaction");
    System.out.println("E. Exit");

    do {
      System.out.println();
      System.out.println("Enter an option: ");
      char option1 = scanner.next().charAt(0);
      option = Character.toUpperCase(option1);
      System.out.println();

      switch (option) {
        case 'A' -> {
          System.out.println("======================================");
          System.out.println("Balance = $" + transData.getBalance());
          System.out.println("======================================");
          System.out.println();
        }
        case 'B' -> {
          System.out.println("Enter an amount to deposit: ");
          int amount = scanner.nextInt();
          transData.deposit(amount);
          System.out.println();
        }
        case 'C' -> {
          System.out.println("Enter amount to withdraw: ");
          int amount2 = scanner.nextInt();
          transData.withdraw(amount2);
          System.out.println();
        }
        case 'D' -> {
          System.out.println("======================================");
          transData.getPreviousTransaction();
          System.out.println("======================================");
          System.out.println();
        }
        case 'E' -> System.out.println("======================================");
        default -> System.out.println("Error: invalid option. Please enter A, B, C, D or E");
      }
    } while (option != 'E');
    System.out.println("Thank you come again " + savingsAccount1.getCustomerName() + "!");
  }
}


