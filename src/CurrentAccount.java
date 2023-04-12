public class CurrentAccount extends BankAccount {

    private double overdraftLimit = 300;

	CurrentAccount(String name, double balance, int accountNum) {
		super(name, accountNum, balance);
	}

	CurrentAccount(String name, double balance) {
		super(name, balance);
	}
    
	@Override
	public void withdraw(double balance) {
		if ((this.balance + overdraftLimit) - balance < 0) {
			System.out.println("Error: balance will exceed your overdraft");
		} else {
			this.balance -= balance;
		}
	}
}
