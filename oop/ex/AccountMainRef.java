package oop.ex;

public class AccountMainRef {

    public static void main(String[] args) {

        AccountRef account = new AccountRef();
        account.deposit(10000);
        account.withdraw(9000);
        account.withdraw(2000);
        System.out.println("잔고: " + account.balance);
    }
}
