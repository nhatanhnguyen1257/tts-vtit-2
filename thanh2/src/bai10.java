import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhâp thông tin sản phẩm: ");
        String productName = sc.nextLine();

        System.out.println("Nhập giá sản phẩm: ");
        Double unitPrice = sc.nextDouble();

        System.out.println("số lượng sản phẩm là: ");
        int quantity = sc.nextInt();

        CartItem cartItem = new CartItem(productName, unitPrice, quantity);

        System.out.println("     Thông tin sản phẩm      ");
        cartItem.displayInfo();
        sc.close();
    }
}
