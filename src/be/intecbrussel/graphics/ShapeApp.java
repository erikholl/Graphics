package be.intecbrussel.graphics;

public class ShapeApp {
    public static void main(String[] args) {
//        Circle myCircle = new Circle();
//        Rectangle myRectangle = new Rectangle();
//        Square mySquare = new Square();
//        Triangle myTriangle = new Triangle();
//        IsoScelesTriangle myIsoScelesTriangle = new IsoScelesTriangle();

        Circle myCircle = new Circle(3);
        Rectangle myRectangle = new Rectangle(11, 15);
        Square mySquare = new Square(4);
        Triangle myTriangle = new Triangle(3,5, 4);
        IsoScelesTriangle myIsoScelesTriangle = new IsoScelesTriangle(3, 7);



        System.out.println("Circle radius: " +myCircle.getRadius() + " area: " + myCircle.getArea() + " perimeter: " + myCircle.getPerimeter());
        System.out.println("Rectangle width: " +myRectangle.getWidth() + " " +
                "area" +
                ": " + myRectangle.getArea());
        System.out.println("Square side: " + mySquare.getSide() + " area: " + mySquare.getArea());
        System.out.println("Triangle perpendicular: " + myTriangle.getPerpendicular() + " " +
                "perimeter: " +myTriangle.getPerimeter() + " height: " +myTriangle.getHeight());
        System.out.println("IsoScelesTriangle area: " + myIsoScelesTriangle.getArea() + " perimeter " +myIsoScelesTriangle.getPerimeter() + " perpendicular" +myIsoScelesTriangle.getPerpendicular());
        System.out.println(Shape.getCount());


    }


}
