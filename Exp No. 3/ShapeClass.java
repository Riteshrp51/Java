abstract class Shape {
    protected double dim1, dim2;

    public Shape(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public abstract double area();
}

class Rectangle extends Shape {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double area() {
        return dim1 * dim2;
    }
}

class Triangle extends Shape {
    public Triangle(double base, double height) {
        super(base, height);
    }

    @Override 
    public double area() {
        return 0.5 * dim1 * dim2;
    }
}

public class ShapeClass {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 5);
        Triangle triangle = new Triangle(8, 4);

        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Area of Triangle: " + triangle.area());
    }
}

