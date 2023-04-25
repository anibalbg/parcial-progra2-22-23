public class Circle extends Shape {
    double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    String ToString(){
        return "Circle with radius: " + radius + " has area: " +  " and perimeter: ";
    }

    double getArea() {
        return super.getArea();
    }

    double getPerimeter() {
        return super.getPerimeter();
    }
}
