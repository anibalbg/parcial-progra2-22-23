public class Rectangle extends Shape {
    double width;
    double length;
    double side=width+length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    double getArea() {
        return super.getArea();
    }

    double getPerimeter() {
        return super.getPerimeter();
    }

    String ToString(){
        return "Rectangle with width: " + width + " and length: " + length;
    }
}
