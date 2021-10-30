package be.intecbrussel.graphics;

public class Triangle extends Shape{

    public static final int ANGLES = 3;
    private static int count;

    private int height;
    private int width;
    private int perpendicular;

    {
        count++;
    }

    // constructor
    public Triangle() {
        this(0, 0, 0);
    }

    public Triangle(int width, int height, int perpendicular) {
        this(width, height, perpendicular, 0, 0);
    }

    public Triangle(int width, int height, int perpendicular, int x, int y) {
        super(x, y);
        setWidth(width);
        setHeight(height);
        setPerpendicular(perpendicular);
    }

    public Triangle(Triangle triangle) {
        this(triangle.getWidth(), triangle.getHeight(),
                triangle.getPerpendicular(), triangle.getX(),
                triangle.getY());
    }

    // methods
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getPerpendicular() {
        return perpendicular;
    }

    public void setPerpendicular(int perpendicular) {
        this.perpendicular = perpendicular;
    }

    @Override
    public double getArea() {
        return ((double) (perpendicular + width) / 2);
    }

    @Override
    public double getPerimeter() {
        return (perpendicular + width + height);
        // formula incorrect, we are aware...
    }

    public static int getCount() {
        return count;
    }
}
