package shapes;

public class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle() {
        this.width = 2.0;  // default width
        this.height = 1.5; // default height
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
