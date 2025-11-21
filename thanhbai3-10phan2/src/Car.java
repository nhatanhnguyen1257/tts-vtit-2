public class Car extends Vehicle {

    private int seats;

    public Car(String brand, String model, int year, int seats){
        super(brand, model, year);
        this.seats = seats;
    }

    @Override
    public void printInfo(){
        System.out.println("=== CAR ===");
        super.printInfo();
        System.out.println("Số chỗ: " + seats);
    }
}
