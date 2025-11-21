public class Employee {
    protected  String name;
    protected double salary;
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
public double calcBonus() {
    return  0;
}
public void display() {
    System.out.println("tên nhân viên: " + name);
    System.out.println("Lương chính thức: " + salary);
    System.out.println("Tiền thưởng nhân viên: " + calcBonus() );
}
}
