package access;

public class BankAccountMain {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        account.deposit(2000);
        account.withdraw(2000);
        System.out.println("잔액: " + account.getBalance());
    }
}
