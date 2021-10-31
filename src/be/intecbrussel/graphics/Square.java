package be.intecbrussel.graphics;

public class Square extends Rectangle {
    private static int count;
    {count++; }


    public Square(){this(0);}


    public Square(int side) { this(side,0,0);

    }

    public Square(int side, int x, int y) {
        super (side,side, x,y);
    }


    public  void setSide ( int side  ) {

        super.setLength(side);
        super.setWidth(side); }



    @Override
    public  void setLength( int length) { setSide(length);
        super.setWidth(length);}

    @Override
    public void setWidth ( int Width) { setSide(Width);}


    public static int getCount() {
        return count;
    }
}
