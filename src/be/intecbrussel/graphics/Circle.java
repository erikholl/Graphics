package be.intecbrussel.graphics;

public class Circle extends Shape{

    public static int Angles = 0;
    private static int count;

    private int radius;

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

    public void grow(int d){
        setRadius(radius * d);
    }
    // we make this a static methode because that is what Manueel expected for us. see in the book for more details//
    public static int getCount(){
        return count;
    }
}
