public class Manager extends Employee{
    public Manager(String name, double salary){
       super(name ,salary);
    }
    @Override
    public double calcBonus(){
        return salary * 0.5 ;
    }
}
