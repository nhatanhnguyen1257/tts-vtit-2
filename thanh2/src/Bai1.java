public class Bai1 {
    static class  Student {
        private int id;
        private String name;
        private int age;
        private double gpa;

        public Student(){
        }

        public Student(int id, String name, int age, double gpa){
            this.id = id;
            this.name = name;
            this.age = age;
            this.gpa = gpa;

        }
        public int getId(){
            return  id;
        }
        public void setId(){
            this.id = id;
        }

        public String getName(){
            return name;
        }
        public void setName(){
            this.name = name;
        }

        public  int getAge(){
            return age;
        }
        public void setAge(){
            this.age = age;
        }

        public double getGpa(){
            return gpa;
        }
        public  void setGpa(){
            this.gpa = gpa;
        }

        public void displayInfo(){
            System.out.println("Thông tin sinh viên.");
            System.out.println("Id sinh viên: "+ id);
            System.out.println("Tên: "+ name);
            System.out.println("Tuổi của sinh viên: "+ age);
            System.out.println("Điểm GPA: "+ gpa);
        }
    }
    public  static void main(String[] args){

        Student st = new Student(1, "Nguyễn Văn Thành", 21, 2.5);
        st.displayInfo();
    }

}
