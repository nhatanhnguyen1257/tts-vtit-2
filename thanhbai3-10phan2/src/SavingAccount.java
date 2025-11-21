public class SavingAccount extends Account {

    private final double minimumBalance = 50000;

    public SavingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Số tiền rút không hợp lệ!");
            return;
        }

        if (balance - amount < minimumBalance) {
            System.out.println("Không thể rút! Phải giữ lại tối thiểu 50,000 VND.");
            return;
        }

        balance -= amount;
        System.out.println("Rút thành công: -" + amount);
    }
}
