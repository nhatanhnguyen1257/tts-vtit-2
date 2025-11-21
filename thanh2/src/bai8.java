public class bai8 {
    public static  void main(String[] args){
        Config c = new Config("Facebook", "1.20.21", 22);

        c.displayInfo();
        c.setVersion("1.20.22");
        c.setMaxConnection(24);
        c.displayInfo();
    }
}
