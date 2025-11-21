public class hinhcau extends Shape3D {
    private double r;

    public hinhcau(double r) {
        this.r = r;
    }
    @Override
    public double volume() {
        return (4.0/3) *  Math.PI * r * r * r;
    }
    @Override
    public double surfaceArea() {
        return 4 * Math.PI * r * r;
    }
}
