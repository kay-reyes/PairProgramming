public class CurrentAccount {
	var currentAcc = new BankAccount();

    double overdraft = 300;
    
    if (currentAcc.accType = 1 & currentAcc.withdraw > currentAcc.balance + overdraft) {
        System.out.println("You are unable to withdraw this value. You have been sent back to the main menu.");
    }
}
    
    /**var currentAcc = new BankAccount();
    double overdraft = 300;
		
	double withdraw = 500;
		
	if (withdraw > balance + overdraft) {
		System.out.println("You are unable to withdraw this value. You have been sent back to the main menu.");
	}
	else {
		balance = balance - withdraw;
		System.out.printf("Your new balance is: %d", balance);
	}**/
