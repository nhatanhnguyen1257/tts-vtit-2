public class Car extends Vehicle {
    public Car(String brand, int year, double speed){
        super(brand, year, speed);
    }
    @Override
    public void move(){
        System.out.println("Ô tô:" + brand );
        System.out.println("Năn sản xuất: " + year);
        System.out.println("Tốc độ tốc độ tối đa: "+ speed +"Km/h");

    }
}
