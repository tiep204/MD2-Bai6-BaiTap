public class Point3D extends Point2D {
    /// private ins tance variables
    private int z;

    ///contrustor
    /// contructs
    public Point3D(){
        super();
        this.z = 0;

    }

    ///contructs
    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    ///getter and setter

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" +super.getX() + "," + super.getY() + "," + this.z + ")";
    }
}
