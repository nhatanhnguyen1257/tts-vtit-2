abstract class Shape2D {
    public abstract double area();
    public abstract double perimeter();

    public void print(){
        System.out.println("Diện tích: " + area());
        System.out.println("Chu vi: " + perimeter());
    }
}
