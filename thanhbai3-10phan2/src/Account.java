public class Account {
    protected String accountNumber;
    protected double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Biến động số dư: +" + amount);
        } else {
            System.out.println("Nạp tiền không hợp lệ!");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Số tiền rút không hợp lệ!");
            return;
        }

        if (amount > balance) {
            System.out.println("Số dư không đủ!");
            return;
        }

        this.balance -= amount;
        System.out.println("Biến động số dư: -" + amount);
    }

    public double getBalance() {
        return balance;
    }
}
