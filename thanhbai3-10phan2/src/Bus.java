public class Bus extends Vehicle {

    private int capacity;

    public Bus(String brand, String model, int year, int capacity){
        super(brand, model, year);
        this.capacity = capacity;
    }

    @Override
    public void printInfo(){
        System.out.println("=== BUS ===");
        super.printInfo();
        System.out.println("Sức chứa: " + capacity + " hành khách");
    }
}
