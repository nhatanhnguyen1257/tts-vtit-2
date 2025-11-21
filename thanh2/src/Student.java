public class Student extends Person {
    private double gpa;

    public Student(String name, int age, double gpa){
        super(name, age);
        this.gpa = gpa;
    }

    @Override
    public void introduce(){
        super.introduce();
        System.out.println("GPA: " + gpa);
    }
}
