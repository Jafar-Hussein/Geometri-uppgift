public abstract class Shape {
    protected String name;
    public Shape(String name){
        this.name = name;
    }
    public abstract double area();
    public abstract double perimeter();
    public String getName(){
        return name;
    }
}
