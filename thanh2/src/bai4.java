import java.util.Scanner;

public class bai4 {
    static class Product {
        private int id;
        private String name;
        private double price;
        private int quantity;

        public Product() {
        }

        public Product(int id, String name, double price, int quantity) {
            this.id = id;
            this.name = name;
            setPrice(price);
            setQuantity(quantity);

        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setPrice(double price) {
            if (price >= 0) this.price = price;
            else {
                System.out.println("Gía không được âm!");
                this.price = 0;
            }
        }
        public void setQuantity(int quantity) {
            if (quantity >= 0) this.quantity = quantity;
            else {
                System.out.println("Số lượng không được âm!");
                this.quantity = 0;
            }
        }

        public double totalValue(){
            return price * quantity;
        }

        public void displayInfo(){
            System.out.println("     Thông tin kho    ");
            System.out.println("ID " + id);
            System.out.println("Tên sản phẩm: " + name);
            System.out.println("Giá sản phẩm: " + price);
            System.out.println("Số lượng sản phẩm: " + quantity);
            System.out.println("Tổng giá trị tồn kho: " + totalValue());

        }
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Nhập ID sản phẩm: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Nhập tên sản phẩm: ");
            String name = sc.nextLine();
            System.out.print("Nhập giá sản phẩm: ");
            Double price = sc.nextDouble();
            System.out.print("Nhập số lượng sản phẩm: ");
            int quantity = sc.nextInt();

            Product p = new Product(id, name, price, quantity);
            p.displayInfo();

            sc.close();
        }
}
