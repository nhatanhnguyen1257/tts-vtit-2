public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.println("Animal sound");
    }

    public void keu() {
        System.out.println("Động vật đó là: " + name);
        System.out.print("Nó kêu: ");
        sound(); // sẽ gọi phương thức override nếu là class con
    }
}
