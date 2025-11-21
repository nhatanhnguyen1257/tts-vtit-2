public class bai14 {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount("111", 100000);
        CheckingAccount ca = new CheckingAccount("222", 50000);

        sa.withdraw(60000); // thất bại
        sa.withdraw(40000); // thành công

        ca.withdraw(60000); // thất bại
        ca.withdraw(20000); // thành công
    }
}
