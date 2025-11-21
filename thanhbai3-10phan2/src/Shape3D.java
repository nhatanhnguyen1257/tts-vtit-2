 public abstract class Shape3D {
    public abstract double volume();
    public abstract double surfaceArea();

    public void print(){
        System.out.println("Thể tích bằng: "+ volume());
        System.out.println("Diện tích xung quanh là: " + surfaceArea());
    }
}
