public class Main {
    public static void main(String[] args) {
        var bankAccount = new BankAccount("kay",100.1);
        var bankAc = new BankAccount("Tommy",300.1);

        System.out.println(bankAccount.accountNumber);
        System.out.println(bankAc.accountNumber);

    }
}