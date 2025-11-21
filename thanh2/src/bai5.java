public class bai5 {
    static class Person{
        private String name;
        private int age;
        private String email;
        private String phone;

        public Person(){
        }
        public Person(String name,int age, String email, String phone){
            this.name = name;
            this.age = age;
            setEmail(email);
            setPhone(phone);
        }
        public String getName(){
            return name;
        }
        public int getAge(){
            return age;
        }
        public  String getEmail(){
            return email;
        }
        public String getPhone(){
            return phone;
        }

        public void setName(String name){
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }
        public void setEmail(String email){
            if (email.contains("@")){
                this.email = email;
            }else {
                System.out.println("Email không hợp lệ!");
                this.email = "XXX@gmail.com";
            }
        }
        public void setPhone(String phone){
            if (phone.matches("(\\d{10})")){
                this.phone = phone;
            }else {
                System.out.println("số điện thoại chưa đủ 10 số. ");
                this.phone = "notfull";
            }
        }
        public void displayInfo(){
            System.out.println("          Thông tin người dùng       ");
            System.out.println("Tên người dùng: " + name);
            System.out.println("Tuổi: "+ age);
            System.out.println("Email: " +email);
            System.out.println("Số điện thoại: " + phone);
        }
    }
    public static void main(String[] args) {
        Person p = new Person("Nguyễn Văn Thành", 20, "tn60875@gmail.com", "0977613323");

        p.displayInfo();
    }
}
