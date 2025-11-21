class hinhvuong extends Shape2D  {
    public double side;
    public hinhvuong(double side) {
        this.side = side;
    }
    @Override
    public double area() {
        return side;
    }
    @Override
    public double perimeter() {
        return 4*side;
    }
}
