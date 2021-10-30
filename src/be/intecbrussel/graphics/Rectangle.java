package be.intecbrussel.graphics;

public class Rectangle extends Shape {

    private static int count;
    public static final int ANGLES = 4;
    private int x;
    private int y;
    private int width;
    private int length;


    public Rectangle() {
        this(1, 1);
    }

    public Rectangle(int width, int length) {
    }

    public Rectangle(int length, int width, int x, int y) {
        setWidth(width);
        setLength(length);
        super.setX(x);
        super.setY(y);

    }

    Shape rectangle = new Rectangle();

    public void setWidth(int width2) {
        if (width2 < 0) {
            width = (int) -width2;
        } else {
            width = (int) width2;
        }
    }

    public void setLength(int length) {
        boolean length2IsNegative = length < 0;

        if (length2IsNegative) {
            this.length = (int) -length;
        } else {
            this.length = (int) length;
        }
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }


    public double getArea() {
        double area = length * width;
        return area;
    }

    public double getPerimeter() {
        return (length * 2) + (width * 2);
    }

    public int grow(int d) {
        return (d);

    }

    public static int getCount(){
        count++;
        return count;
    }
}
