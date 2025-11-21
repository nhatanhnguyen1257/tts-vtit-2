public class bai19 {
    public static void main(String[] args) {
        Shape2D square = new hinhvuong(5);

        Shape3D cube = new hinhcau(3);


        System.out.println("=== HÌNH VUÔNG ===");
        square.print();

        System.out.println("\n=== HÌNH CẦU ===");
        cube.print();
    }
}

