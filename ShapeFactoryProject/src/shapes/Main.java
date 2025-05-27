package shapes;

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape circle = factory.createShape("circle");
        Shape rectangle = factory.createShape("rectangle");
        Shape triangle = factory.createShape("triangle");

        System.out.println("Area of Circle: " + circle.getArea());
        System.out.println("Area of Rectangle: " + rectangle.getArea());
        System.out.println("Area of Triangle: " + triangle.getArea());
    }
}
