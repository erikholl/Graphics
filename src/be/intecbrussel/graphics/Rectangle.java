// Jan and Emrah

package be.intecbrussel.graphics;

public class Rectangle extends Shape {
    // variables
    private static int count;
    public static final int ANGLES = 4;
    private int width;
    private int height;

    // constructors
    public Rectangle() {
        this(1, 1);
    }

    public Rectangle(int height, int width) {
        this(height, width, 0, 0);
    }

    public Rectangle(int height, int width, int x, int y) {
        setWidth(width);
        setHeight(height);
        super.setX(x);
        super.setY(y);

    }
    public Rectangle(Rectangle rectangle){
        this(rectangle.getWidth(),rectangle.getHeight(),rectangle.getX(),rectangle.getY());
    }

    // methods
    public void setWidth(int width2) {
        if (width2 < 0) {
            width = (int) -width2;
        } else {
            width = (int) width2;
        }
    }

    public void setHeight(int height) {
        boolean length2IsNegative = height < 0;

        if (length2IsNegative) {
            this.height = (int) -height;
        } else {
            this.height = (int) height;
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return(height * width);
    }

    @Override
    public double getPerimeter() {
        return (height * 2) + (width * 2);
    }

    public int grow(int d) {
        return (d);
    }

    public static int getCount(){
        count++;
        return count;
    }
}
