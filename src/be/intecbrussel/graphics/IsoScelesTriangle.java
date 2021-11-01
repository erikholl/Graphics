// Marouane, Mustafa, Erik

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
    // referencing to the superclass is not correct in above override methods
    // (as we want to override the method in superclass)
    // however, we did not find the correct mathematical solution; we want to
    // illustrate awareness of how to refer back and being aware of what we
    // SHOULD put (a class specific formula for width and perpendicular)

    public static int getCount() {
        return count;
    }

}
