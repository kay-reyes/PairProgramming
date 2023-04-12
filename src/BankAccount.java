public class BankAccount {
    private String customerName;

    int accountNumber;
    double balance;

    static private int newAccountNumber = 100000;

    public BankAccount(String customerName, int accountNumber, double balance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    public BankAccount(String customerName, double balance) {
        this(customerName,0,balance);
        setAccountNumber(accountNumber);
        newAccountNumber++;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber){
        if (this.accountNumber == 0){
            accountNumber = newAccountNumber;
        }

        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double balance) {
        this.balance += balance;
    }

    public void withdraw(double balance) {
        if (this.balance - balance < 0) {
            System.out.println("Error: balance will be less than zero");
        } else {
            this.balance -= balance;
        }
    }
}
