import java.util.Scanner;
abstract class Shape {
    double dim1, dim2;

    Shape(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    abstract void area();
}

class Rectangle extends Shape {
    Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    void area() {
        double result = dim1 * dim2;
        System.out.println("Area of Rectangle: " + result);
    }
}

class Triangle extends Shape {
    Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    void area() {
        double result = 0.5 * dim1 * dim2;
        System.out.println("Area of Triangle: " + result);
    }
}

class ShapeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth of rectangle:");
        double rLength = sc.nextDouble();
        double rBreadth = sc.nextDouble();
        Rectangle rect = new Rectangle(rLength, rBreadth);
        rect.area();

        System.out.println("Enter base and height of triangle:");
        double tBase = sc.nextDouble();
        double tHeight = sc.nextDouble();
        Triangle tri = new Triangle(tBase, tHeight);
        tri.area();
    }
}
