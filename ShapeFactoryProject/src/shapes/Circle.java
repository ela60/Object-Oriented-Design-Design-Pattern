package shapes;

public class Circle implements Shape {
    private double radius;

    public Circle() {
        this.radius = 1.0; // default radius
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
