public class Rectangle {
    double width;
    double length;

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

    String ToString(){
        return "Rectangle with width: " + width + " and length: " + length;
    }
}
