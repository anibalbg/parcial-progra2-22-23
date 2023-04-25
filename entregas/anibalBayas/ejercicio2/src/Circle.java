public class Circle {
    double radius;
    double area;
    double perimeter;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
    String ToString(){
        return "Circle with radius: " + radius + " has area: " + area + " and perimeter: " + perimeter;
    }
}
