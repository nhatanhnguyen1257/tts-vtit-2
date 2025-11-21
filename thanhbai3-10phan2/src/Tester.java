public class Tester extends Employee{
    public Tester(String name, double salary) {
        super(name, salary);
    }
    @Override
    public double calcBonus() {
        return salary * 0.1;
    }
}
