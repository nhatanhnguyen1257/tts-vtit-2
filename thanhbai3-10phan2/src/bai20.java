import java.util.ArrayList;
public class bai20 {
    public static void main(String[] args) {

        ArrayList<Vehicle> list = new ArrayList<>();

        list.add(new Car("Toyota", "Vios", 2020, 5));
        list.add(new Bus("Hyundai", "Universe", 2019, 45));
        list.add(new Truck("Isuzu", "FXZ", 2021, 10));

        for (Vehicle v : list){
            v.printInfo();
            System.out.println();
        }
    }
}
