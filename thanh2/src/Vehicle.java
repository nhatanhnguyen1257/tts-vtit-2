public class Vehicle {
    protected String brand;
    protected   int year;
    protected   double speed;

    public  Vehicle(String brand, int year, double speed) {
        this.brand = brand;
        this.year = year;
        this.speed = speed;
    }
    public void  move(){
        System.out.println("hãng xe: "+ brand);
        System.out.println("Năm sản xuất: "+ year);
        System.out.println("tốc độ giới hạn của xe: "+ speed + " km/h");
    }
}
