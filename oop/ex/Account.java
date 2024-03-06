package oop.ex;

import java.util.Scanner;

public class Account {

    int balance;

    void option() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. 입금 || 2. 출금 || 3. 잔액");
        int menu = scanner.nextInt();

        if (menu == 1){
            deposit();
        } else if (menu == 2) {
            withdraw();
        } else if (menu == 3) {
            System.out.println("잔액: " + balance);
        }
    }
    void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입급할 액수: ");
        int amount = scanner.nextInt();
        balance += amount;
    }
    void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("출금할 액수: ");
        int amount = scanner.nextInt();
        if (balance < amount) {
            System.out.println("잔고 부족");
        } else {
            balance -= amount;
        }
    }
}
