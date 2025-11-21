public class Deverloper extends Employee {
    public Deverloper(String name, double salary) {
        super(name, salary);
    }
 @Override
 public double calcBonus(){
        return salary * 0.2;
 }
}