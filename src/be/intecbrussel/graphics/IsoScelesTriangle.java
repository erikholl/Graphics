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
        super.setWidth(width);
    }

    @Override
    public void setPerpendicular(int perpendicular) {
        super.setPerpendicular(perpendicular);
    }
    // we refer here back to the super method, so it does not make a lot of
    // sense to override - we're doing it still though, to illustrate we get
    // the hierarchy and how to refer back.

    public static int getCount() {
        return count;
    }


}
