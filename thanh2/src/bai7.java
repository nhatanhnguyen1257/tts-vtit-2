public class bai7 {
    public static void main(String[] args) {
        ScoreManager sm = new ScoreManager();

        sm.setToan(8.5);
        sm.setLy(7);
        sm.setHoa(9);

        System.out.println("Điểm TB = " + sm.diemtrungbinh());
    }
}