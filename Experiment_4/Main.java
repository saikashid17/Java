import java.util.Scanner;
interface Shape {
    double area();
}
class Rectangle implements Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    public double area() {
        return length * width;
    }
}
class Triangle implements Shape {
    double base, height;

    Triangle(double b, double h) {
        base = b;
        height = h;
    }

    public double area() {
        return 0.5 * base * height;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of Rectangle: ");
        double l = sc.nextDouble();
        System.out.print("Enter width of Rectangle: ");
        double w = sc.nextDouble();
        Shape rect = new Rectangle(l, w);

        System.out.print("Enter base of Triangle: ");
        double b = sc.nextDouble();
        System.out.print("Enter height of Triangle: ");
        double h = sc.nextDouble();
        Shape tri = new Triangle(b, h);

        System.out.println("Area of Rectangle: " + rect.area());
        System.out.println("Area of Triangle: " + tri.area());

        sc.close();
    }
}
