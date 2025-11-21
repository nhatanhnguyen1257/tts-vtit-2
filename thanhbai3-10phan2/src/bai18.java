public class bai18 {
    static class Product{
        protected String name;
        protected double price;

        public Product(String name, double price){
            this.name = name;
            this.price = price;
        }
        public void show(){
            System.out.println(name+": "+price);
        }
    }
    static class ElectronicProduct extends Product{
        private int baohanh;
        public ElectronicProduct(String name, double price, int baohanh){
            super(name, price);
            this.baohanh = baohanh;
        }

        @Override
        public void show(){
            System.out.println("==== Thiết bị điện tử ====");
            super.show();
            System.out.println("Bảo hành: " + baohanh+ " tháng");
            System.out.println("---------------------");
        }
    }
    static class FoodProduct extends Product{
        private int hansudung;
        public FoodProduct(String name, double price, int hansudung){
            super(name, price);
            this.hansudung = hansudung;
        }
        @Override
        public void show(){
            System.out.println("      Đồ ăn vặt      ");
            super.show();
            System.out.println("Hạn sử dụng " + hansudung);
            System.out.println("~~~~~~~~~~~~~~~");
        }
    }
    static  class BookProduct extends Product{
        private String tacgia;

        public BookProduct(String name, double price, String tacgia){
            super(name, price);
            this.tacgia = tacgia;
        }
        @Override
        public void show(){
            System.out.println("       Loại sách       ");
            super.show();
            System.out.println("Tác giả "+ tacgia);
            System.out.println("~~~~~~~~~~~~~~~");
        }
    }
    public static void main(String[] args) {
        Product TV = new ElectronicProduct("LG", 2000, 2);
        Product Cake = new FoodProduct("Cake", 3000,2026 );
        Product Book = new BookProduct("Đắc nhân tâm",5000, "Dale Carnegie");

        TV.show();
        System.out.println();
        Cake.show();
        System.out.println();
        Book.show();
    }
}
