public class Truck extends Vehicle {

    private double payload;

    public Truck(String brand, String model, int year, double payload){
        super(brand, model, year);
        this.payload = payload;
    }

    @Override
    public void printInfo(){
        System.out.println("=== TRUCK ===");
        super.printInfo();
        System.out.println("Tải trọng: " + payload + " tấn");
    }
}
