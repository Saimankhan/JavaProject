/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuadrilatralHw;

/**
 *
 * @author user
 */
public class Trapezoid extends Quadrilateral {
    public Trapezoid(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    public double area() {
        double base1 = distance(getP1(), getP2());
        double base2 = distance(getP3(), getP4());
        double height = Math.abs(getP1().getY() - getP3().getY());
        return ((base1 + base2) / 2) * height;
    }

    private double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }
}
