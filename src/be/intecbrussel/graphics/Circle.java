// Zuhur and Uneys

package be.intecbrussel.graphics;

public class Circle extends Shape{
    // variables
    public static int Angles = 0;
    private static int count;
    private int radius;

    // initialisation block
    {
        count++;
    }

    // constructors
    public Circle(){
        this(1);
    }

    public Circle(int radius) {
        this(radius,0,0);
    }

    public Circle(int radius, int x, int y) {
        super(x, y);
        setRadius(radius);
    }

    public Circle(Circle circle) {
        this(circle.getRadius(),circle.getX(),circle.getY());
    }

    //methods
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    // this is our get area methode--> and return type
    @Override
    public double getArea(){
        return (3 * radius);
    }

    @Override
    public double getPerimeter(){
        return (2 * radius);
    }
    // the formulas in the overrides are not correct, it is the programming
    // logic that is important :)

    public void grow(int d){
        setRadius(radius * d);
    }

    public static int getCount(){
        return count;
    }
}
