// All in group meeting

package be.intecbrussel.graphics;

public abstract class Shape {
    // variables
    private static int count;
    private int x;
    private int y;

    // initialisation block
    {
        count++;
    }

    // constructors
    public Shape() {
        this(0, 0);
    }

    public Shape(int x, int y) {
        this.x = x; // we refer back to the private int x declared
        this.y = y; // we refer back to the private int y declared
    }

    // methods
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // abstract methods
    public abstract double getArea();

    public abstract double getPerimeter();

    // static method
    public static int getCount() {
        return count;
    }
}
