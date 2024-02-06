package org.example;

public class BankAccount {

    private double balance;

    public BankAccount(double initialBalance) {

        this.balance = initialBalance;
    }

    public double checkBalance() {
        if (balance < 0) {
            System.out.println("Hata: Yetersiz bakiye: " + balance);
        }
        return balance;
    }
    public void withdraw(double amount) {
        try {
            if (amount > balance) {
                throw new IllegalArgumentException("Hata: Yetersiz bakiye: " + balance);
            } else {
                balance -= amount;
                System.out.println(amount + " TL çekildi. Yeni bakiye: " + balance);
            }
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        double currentBalance = account.checkBalance();
        System.out.println("Mevcut bakiye: " + currentBalance);

        double withdrawalAmount = 200;
        account.withdraw(withdrawalAmount);
    }
}
