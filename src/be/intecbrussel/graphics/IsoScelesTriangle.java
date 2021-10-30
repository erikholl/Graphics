package be.intecbrussel.graphics;

public class IsoScelesTriangle extends Triangle {
    // variables
    private static int count;

    // initialisation block
    {
        count++;
    }

    // constructors
    public IsoScelesTriangle() {
        this(0,0);
    }

    public IsoScelesTriangle(int width, int height) {
        this(width, height, 0, 0);
    }

    public IsoScelesTriangle(int width, int height, int x, int y) {
        super.setHeight(height);
        super.setPerpendicular(getPerpendicular());
        super.setX(x);
        super.setY(y);
        setWidth(width);
    }

    public IsoScelesTriangle(IsoScelesTriangle isoScelesTriangle) {
        this(isoScelesTriangle.getWidth(), isoScelesTriangle.getHeight(),
                isoScelesTriangle.getX(), isoScelesTriangle.getY());
    }

    // methods
    @Override
    public void setWidth(int width) {

    }

    @Override
    public void setPerpendicular(int perpendicular) {
        setPerpendicular(4);
    }

    public static int getCount() {
        return count;
    }


}
