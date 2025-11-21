public class bai13 {
    public static void main(String[] args) {
        Shape c = new Circle(3 );
        Shape r = new Rectangle(5 , 10);
        Shape t = new Triangle(7 , 10);

        System.out.println("Diện tích hình tròn: " + c.area());
        System.out.println("Diện tích hình chữ nhật: " + r.area());
        System.out.println("Diện tích hình tam giác: " + t.area());
    }

}
