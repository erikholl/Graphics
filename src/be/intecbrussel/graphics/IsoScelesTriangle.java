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
        // setPerpendicular(perpendicular); // why does this not work? unclear
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
    // we refer for setWidth and setPerpendicular back to the super
    // method, so it does not make a lot of sense to override. we're doing
    // it anyway, to illustrate we understand hierarchy and how to
    // refer back. If we'd know the specific formula for width and
    // perpendicular of IsoScelesTriangle, we'd included these instead.

    public static int getCount() {
        return count;
    }


}
