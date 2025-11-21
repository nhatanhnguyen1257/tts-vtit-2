import java.util.Scanner;

public class baii3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chiều dài: ");
        double l = sc.nextDouble();

        System.out.print("Nhập chiều rộng: ");
        double w = sc.nextDouble();

        Rectangle rect = new Rectangle(l, w);
        rect.displayInfo();

        sc.close();
    }
}
