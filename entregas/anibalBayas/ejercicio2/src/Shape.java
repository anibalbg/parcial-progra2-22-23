public class Shape {
    String color;
    boolean filled;
    double getArea(){
        return 0;
    }
    double getPerimeter(){
        return 0;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    String ToString(){
        return "Shape with color: " + color + " and filled: " + filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    boolean isFilled(){
        return filled;
    }
}
