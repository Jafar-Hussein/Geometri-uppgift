public class Circle extends Shape{
    protected static double radius;
    public  Circle(double radius){
        super("Circle");
        this.radius = radius;
    }
    public double area(){
        return Math.PI * radius * radius;
    }
    public double perimeter(){
        return 2 * Math.PI * radius;
    }
}
