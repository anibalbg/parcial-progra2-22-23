public class Square extends Rectangle{
    double getSide(){
        return side;
    }
    void setSide(double side){
        this.side=side;
    }

    public void setLength(double length) {
        super.setLength(length);
    }
    String ToString(){
        return "Square with side: " + side;
    }
}
