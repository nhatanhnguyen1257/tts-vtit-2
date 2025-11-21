
public class bai2 {
    static class BankAccount{
        private String accountNumber;
        private String ownerName;
        private double blace;

        public BankAccount(){
        }

        public BankAccount(String accountNumber, String ownerName, double blace){
            this.accountNumber = accountNumber;
            this.ownerName = ownerName;
            this.blace = blace;
        }

        public String getAccountNumber(){
            return accountNumber;
        }
        public String getOwnerName(){
            return ownerName;
        }
        public double blace(){
            return blace;
        }
        public void deposit(double amount){
            if(amount > 0){
                blace = blace + amount;
                System.out.println("Nạp tiền: "+ amount +" Nạp tiền thành công. số dư mới là: "+ blace);
            }else {
                System.out.println("số tiền nạp phải lơn hơn 0đ!");
            }
        }
        public void withdraw(double amount){
            if(amount <= 0){
                System.out.println("rút tiền phải lơn hơn 0đ");
            }else {
                blace = blace-amount;
                System.out.println("rút tiền "+ amount +" Rút thành công. số dư mới là: "+blace);
            }
        }
    }
    public static void main(String [] args){

        BankAccount acc = new BankAccount("11224", "Nguyễn Văn Thành", 50000);
           acc.deposit(2000);
           acc.withdraw(1000);
           acc.withdraw(10000);

            }

    }


