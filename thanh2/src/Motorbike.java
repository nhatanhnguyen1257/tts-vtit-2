public class Motorbike extends Vehicle {
    public Motorbike(String brand, int year, double speed) {
        super(brand, year, speed);

    }

    @Override
    public void move(){
        System.out.println("xe máy: "+ brand);
        System.out.println("Năm sản xuất: "+ year);
        System.out.println("Tốc độ tối đa: "+ speed +"Km/h");
    }
}

