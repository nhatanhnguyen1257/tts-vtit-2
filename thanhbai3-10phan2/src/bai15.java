public class bai15 {
    public static void main(String[] args) {
        Employee dev = new Deverloper("Thanh", 1000);
        Employee man = new Manager("Tuan", 2000);
        Employee test = new Tester("Hai",500);

        System.out.println("     Thông tin nhân viên Dev     ");
        dev.display();

        System.out.println("\n        Thông tin quản lý       ");
        man.display();

        System.out.println(" \n      Thông tin nhân viên tester         ");
        test.display();

    }

}
