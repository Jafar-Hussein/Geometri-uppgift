public class Square extends Shape{
    protected static double side;
    public Square(double side){
        super("Square");
        this.side = side;
    }
    public double area(){
        return side * side;
    }
    public double perimeter(){
        return 4 * side;
    }
}
