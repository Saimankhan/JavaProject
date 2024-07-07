/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuadrilatralHw;

/**
 *
 * @author user
 */
public class Square extends Rectangle {
    public Square(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    /**
     *
     * @return
     */
    @Override
    public double area() {
        double side = distance(getP1(), getP2());
        return side * side;
    }
}

