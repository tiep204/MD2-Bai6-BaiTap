public class Main {
    public static void main(String[] args) {
    Point poi = new Point(20,30);
        System.out.println(poi.toString());
        poi.setXY(10,20);
        System.out.println(poi.toString());
        poi = new MoveAblePoint(poi.getX(),poi.getY(), 10,20);
        System.out.println(poi.toString());
        ((MoveAblePoint) poi).move();
        System.out.println(poi.toString());
        MoveAblePoint move = new MoveAblePoint(20,20);
        System.out.println(move.toString());
        move.move();
        System.out.println(move.toString());
    }
}