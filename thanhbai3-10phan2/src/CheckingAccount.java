public class CheckingAccount extends Account {

    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Số tiền rút không hợp lệ!");
            return;
        }

        // checking account: cho rút hết tiền
        if (amount > balance) {
            System.out.println("Không đủ tiền trong tài khoản!");
            return;
        }

        balance -= amount;
        System.out.println("Rút thành công: -" + amount);
    }
}
