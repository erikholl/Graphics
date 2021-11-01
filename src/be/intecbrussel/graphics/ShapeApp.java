// All in group meeting

package be.intecbrussel.graphics;

public class ShapeApp {
    public static void main(String[] args) {

        // create objects without parameters (default values)
        Circle myCircle = new Circle();
        Rectangle myRectangle = new Rectangle();
        Square mySquare = new Square();
        Triangle myTriangle = new Triangle();
        IsoScelesTriangle myIsoScelesTriangle = new IsoScelesTriangle();

        // create objects with some parameters
        Circle myCircle2 = new Circle(3, 60, 90);
        Rectangle myRectangle2 = new Rectangle(11, 15);
        Square mySquare2 = new Square(4);
        Triangle myTriangle2 = new Triangle(3,5, 4);
        IsoScelesTriangle myIsoScelesTriangle2 = new IsoScelesTriangle(3, 7);

        // print values of default objects
        System.out.println("Circle radius: " + myCircle.getRadius() + " area:" +
                " " + myCircle.getArea() + " perimeter: " + myCircle.getPerimeter());
        System.out.println("Rectangle width: " + myRectangle.getWidth() + " " + " area: " + myRectangle.getArea());
        System.out.println("Square side: " + mySquare.getSide() + " area: " + mySquare.getArea());
        System.out.println("Triangle perpendicular: " + myTriangle.getPerpendicular() + " perimeter: " + myTriangle.getPerimeter() + " height: " +myTriangle.getHeight());
        System.out.println("IsoScelesTriangle area: " + myIsoScelesTriangle.getArea() + " perimeter: " + myIsoScelesTriangle.getPerimeter() + " perpendicular: " +myIsoScelesTriangle.getPerpendicular());

        // print values of objects with parameters provided
        System.out.println("Circle2 x-coordinate: " + myCircle2.getX() + " " +
                "y-coordinate: " + myCircle2.getY() + " perimeter: " + myCircle2.getPerimeter());
        System.out.println("IsoScelesTriangle2 area: " + myIsoScelesTriangle2.getArea() + " height: " + myIsoScelesTriangle2.getHeight() + " width: " + myIsoScelesTriangle2.getWidth());
        System.out.println("Rectangle2 area: " + myRectangle2.getArea() + " " +
                "perimeter: " + myRectangle2.getPerimeter());

        // print counts for shape, triangles and squares
        System.out.println("The total number of shapes created is: " + Shape.getCount());
        System.out.println("The total number of triangles created is: " + Triangle.getCount());
        System.out.println("The total number of squares created is: " + Square.getCount());
    }
}
