public class Rectangle extends Shape{
 protected static double height;
 protected static double width;
    public Rectangle(double height, double width){
        super("Rectangle");
    this.height = height;
    this.width = width;
    }
    public double area(){
        return height + width;
    }
    public double perimeter(){
        return 2 * (height+ width);
    }
}
