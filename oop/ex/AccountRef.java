package oop.ex;

import java.util.Scanner;

public class AccountRef {

    int balance;

    void deposit(int amount) {
        balance += amount;
    }
    void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("잔고 부족");
        } else {
            balance -= amount;
        }
    }
}
