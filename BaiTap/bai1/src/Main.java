import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Circle cr = new Circle();
        cr.setRadius(4);
        System.out.println("dien tich hinh tron la : " + cr.getArea());

        Cylinder ci = new Cylinder(cr.getRadius(), cr.getColor(), 10);
        System.out.println("Tong la: " + ci.getTotalArea());
    }
}