
    public class ScoreManager {
        private double toan;
        private double ly;
        private double hoa;

        public ScoreManager() {
        }

        public ScoreManager(double toan, double ly, double hoa) {
            setToan(toan);
            setLy(ly);
            setHoa(hoa);

        }
        public void setToan(double toan){
            if(toan >= 0 && toan <= 10){
                this.toan = toan;
                System.out.println("Điểm toán là: "+ toan);
            }else {
                System.out.println("điểm toán không hợp lệ!");
            }
        }
        public void setLy(double ly){
            if(ly >= 0 && ly <= 10 ){
                this.ly = ly;
                System.out.println("Điểm lý là: " + ly);
            }else {
                System.out.println("Điểm lý không hợp lệ! ");
            }
        }
        public void setHoa(double hoa){
            if (hoa >= 0 && hoa <= 10){
                this.hoa = hoa;
                System.out.println("Điểm hoá là: " + hoa);
            }else {
                System.out.println("Điểm hoá không hợp lệ! ");
            }
        }

        public double getToan() {
            return toan;
        }

        public double getLy() {
            return ly;
        }

        public double getHoa() {
            return hoa;
        }
        public double diemtrungbinh(){
            return (toan+ly+hoa)/3;
        }
    }

