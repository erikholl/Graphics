package be.intecbrussel.graphics;

public class Circle extends Shape{

    public static int Angles = 0;
    private static int count;



    private int radius;
    {
        count++;
    }




    // this is a constructor without parameters//
    public Circle(){
        this(1);


    }
    // this is a constructor with one parameter
    public Circle(int radius) {
        this(radius,0,0);


    }
    // this is a constructor with two parameters
    public Circle(int radius, int x, int y) {

        setRadius(radius);


    }



    public Circle(Circle circle) {
        this(circle.getRadius(),circle.getX(),circle.getY());
    }
    //this is our get methode for Radius//
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    // this is our get area methode--> and return type
    public double getArea(){
        return getArea();
    }
    public double getPerimeter(){
        return getPerimeter();
    }
    public void grow(int d){
        setRadius(radius*d);
    }
    // we make this a static methode because that is what Manueel expected for us. see in the book for more details//
    public static int getCount(){
        return count;
    }
}
