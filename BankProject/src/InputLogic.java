// logic for input and output.

import java.util.Scanner;

public final class InputLogic {
  Account currentAccount1 = new Account("Savings Account", "Anders", "199998");

  public InputLogic() {
    char option = '\0';
    Scanner scanner = new Scanner(System.in);
    System.out.println("Welcome, " + currentAccount1.getCustomerName() + "!");
    System.out.println("Your ID is: " + currentAccount1.getCustomerId());
    System.out.println("You are viewing your " + currentAccount1.getAccountName());
    System.out.println();
    System.out.println("Wha can we do for you today?");
    System.out.println();
    System.out.println("A. Check your balance");
    System.out.println("B. Make a deposit");
    System.out.println("C. Make a withdrawal");
    System.out.println("D. View previous transaction");
    System.out.println("E. Exit");

  }
}


