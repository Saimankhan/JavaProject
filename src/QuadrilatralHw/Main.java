/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuadrilatralHw;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 0);
        Point p3 = new Point(4, 3);
        Point p4 = new Point(0, 3);

        Quadrilateral quad = new Quadrilateral(p1, p2, p3, p4);
        Trapezoid trap = new Trapezoid(p1, p2, new Point(3, 3), p4);
        Parallelogram para = new Parallelogram(p1, p2, p3, p4);
        Rectangle rect = new Rectangle(p1, p2, p3, p4);
        Square square = new Square(p1, new Point(3, 0), new Point(3, 3), new Point(0, 3));

        System.out.println("Trapezoid area: " + trap.area());
        System.out.println("Parallelogram area: " + para.area());
        System.out.println("Rectangle area: " + rect.area());
        System.out.println("Square area: " + square.area());
    }
}
