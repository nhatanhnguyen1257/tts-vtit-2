public class CartItem {
    private String productName;
    private double unitPrice;
    private int quantity;

    public CartItem(String productName, double unitPrice, int quantity){
        this.productName = productName;
        this.unitPrice = unitPrice;
        setQuantity(quantity);  // dùng setter để kiểm tra
    }

    public String getProductName(){
        return productName;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }

    public double getUnitPrice(){
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        if (quantity >= 1) {
            this.quantity = quantity;
        } else {
            System.out.println("Số lượng phải lớn hơn hoặc bằng 1. Tự động đặt bằng: 1");
            this.quantity = 1;
        }
    }

    // Tính thành tiền
    public double totalPrice() {
        return unitPrice * quantity;
    }

    // Hiển thị thông tin
    public void displayInfo() {
        System.out.println("Sản phẩm: " + productName);
        System.out.println("Đơn giá: " + unitPrice);
        System.out.println("Số lượng: " + quantity);
        System.out.println("Thành tiền: " + totalPrice());
    }
}
