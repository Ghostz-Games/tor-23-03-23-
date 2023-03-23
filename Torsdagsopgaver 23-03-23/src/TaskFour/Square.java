package TaskFour;

public class Square implements Shape{

    double r;
    public Square(double r){
        this.r = r;
    }

    @Override
    public double getArea() {
        return r * r;
    }
}
