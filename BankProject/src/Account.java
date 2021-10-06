// Account class to store data for user input

public final class Account {
    private final String accountName;
    private final String customerName;
    private final String customerId;

    public Account(String accountName, String customerName, String customerId) {
        this.accountName = accountName;
        this.customerName = customerName;
        this.customerId = customerId;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

}
