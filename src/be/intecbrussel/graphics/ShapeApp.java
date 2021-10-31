package be.intecbrussel.graphics;

public class ShapeApp {
    public static void main(String[] args) {
        Circle myCircle = new Circle();
        Rectangle myRectangle = new Rectangle();
        Square mySquare = new Square();
        Triangle myTriangle = new Triangle();
        IsoScelesTriangle myIsoScelesTriangle = new IsoScelesTriangle();

        System.out.println(myCircle);
        System.out.println(myRectangle);
        System.out.println(mySquare);
        System.out.println(myTriangle);
        System.out.println(myIsoScelesTriangle);
        System.out.println(Shape.getCount());


    }


}
