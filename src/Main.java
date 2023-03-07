public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(5, 10);
        shapes[2] = new Square(5);

        for (int i = 0; i< shapes.length; i++){
            System.out.println("\t" + shapes[i].getName() + "\n Area: " + shapes[i].area() + "\n Omkrets: " + shapes[i].perimeter());
            System.out.println();
        }
    }
}