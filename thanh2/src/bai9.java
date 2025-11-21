import java.util.Scanner;

public class bai9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        LoginForm login = new LoginForm("thanhnguyen", "12345678");

        login.displayInfo();

        System.out.println("Nhập password để kiểm tra: ");
        String input = sc.nextLine();

        if (login.checkPassword(input)) {
            System.out.println("✔Đăng nhập thành công!");
        } else {
            System.out.println(" Sai password!");
        }

        sc.close();
    }
}
