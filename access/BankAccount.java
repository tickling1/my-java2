package access;

public class BankAccount {

    private int balance;

    public BankAccount() { 
        balance = 0;
    }
    public void deposit(int amount) {
        if (isAmountValid(amount)){ // 참이면 실행
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }
    public void withdraw (int amount){
        if (isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("올바르지 않은 금액입니다. 잔액을 확인해주세요");
        }
    }
    public int getBalance() {
        return balance;
    }
    private boolean isAmountValid(int amount) { // 금액이 0보다 커야 합니다.
        // 금액이 0보다 커야함
        return amount >= 0;
    }
}
