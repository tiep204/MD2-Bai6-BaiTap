public class Point2D {

    ///Thuoc tinh
    private int x;
    private int y;

    ///phuong thuc
    ////ham khoi tao khong tham so
    public Point2D() {
        this.x = 0;
        this.y = 0;
    }

    ///ham khoi tao co tham so
    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    ///getter and setter

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    ///

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
