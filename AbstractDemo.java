abstract class Shape {

    private String shape;

    public Shape(String shape){
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    abstract void areaOf();
}

class Triangle extends Shape {

    public Triangle() {
        
        this("Triangle");
    }
    
    public Triangle(String shape) {
        
        super("Triangle");
    }

    void areaOf() {      
       // System.out.println(1 / 2 * b * h);
    }
}

class Square extends Shape {
    
    public Square() {
        
        this("Square");
       
    }
    
    public Square(String shape) {
        
        super("Square");
       
    }

    void areaOf() {
    }
}

public class AbstractDemo {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[2];
        shapes[0] = new Triangle();
        shapes[1] = new Square();
        for (Shape shape1 : shapes){
            //System.out.println(shape1.areaOf());
            System.out.println(shape1.getShape());
        }

    }

}
