public class bai6 {
    static class Employee{
        public int id;
        private String name;
        private double baseSalary;
        private double bonus;

        public Employee(){
        }
    public Employee(int id, String name, double baseSalary, double bonus){
            this.id = id;
            this.name = name;
            this.baseSalary = baseSalary;
            setBonus(bonus);
    }
    public int getId(){
            return id;
    }
    public String getName(){
            return name;
    }
    public double getBaseSalary(){
            return baseSalary;
    }
    public double getBonus(){
            return bonus;
    }
    public void setBonus(double bonus){
            if (bonus >0 && bonus <= 0.5* baseSalary){
                this.bonus = bonus;
            }else {
                System.out.println("số tiền thưởng không hợp lệ !");
                this.bonus = 0;
            }
    }
    public double totalSalary(){
            return baseSalary*bonus;
    }
    public void displayInfo(){
            System.out.println("     Thông tin lương    ");
            System.out.println("ID: " + id);
            System.out.println("Tên: "+ name);
            System.out.println("lương cơ bản là: "+ baseSalary);
            System.out.println("Số tiền thưởng là: "+ bonus);
            System.out.println("lương thực tế là: " + totalSalary());
    }

    }
    public static void main(String[] args){
        Employee i = new Employee(6368, "Nguyễn Văn Thành", 100000, 1000);
        i.displayInfo();
    }
}
