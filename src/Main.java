public class Main {
    public static void main(String[] args) {
        var kayAcc = new BankAccount("kay",100.1);
        var tommyAcc = new BankAccount("Tommy",300.1);

        System.out.println(kayAcc.accountNumber);
        System.out.println(tommyAcc.accountNumber);

    }
}