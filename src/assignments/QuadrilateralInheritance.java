
// Vannara Thong CIS-18A Chapter 9, p.901, #9.8
/**************************************************************
 * Programmer Name: Vannara Thong
 * Assignment Start: 05/02/2024 05:00PM
 * Assignment Completion:05/02/2024 9:00PM
 * Total Hours for Assignment: 4.0 Hours
 * Comments:  N/A
 **************************************************************/

/**************************************************************
 * 
 * GET AREA OF ALL SHAPES     
 * ____________________________________________________________
 * This program allows the user to get the area and perimeter
 * of a rectangle. This is done by prompting the user to enter
 * the length and width of the rectangle. The program then
 * calculates and displays the area and perimeter using these
 * values.
 * 
 * Calculation is based on this formula:
 * area = r.length * r.width;
 * perimeter = 2 * (r.length + r.width);
 * ____________________________________________________________
 * INPUT
 *  input                       : get length and width
 * 
 * OUTPUT
 *  r.length                    : Length of rectangle
 *  r.width                     : Width of rectangle
 *  area                        : Total results
 *  perimeter                   : Total results
 * 
 **************************************************************/
package Assignments;

import java.util.*;
import java.lang.*;

@SuppressWarnings("unused")
class Point {
    private double x;
    private double y;

    /* Point Overload */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

class Quadrilateral {
    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;

    /* Quadrilateral overload */
    public Quadrilateral(Point p1, Point p2, Point p3, Point p4) {
        this.point1 = p1;
        this.point2 = p2;
        this.point3 = p3;
        this.point4 = p4;

    }

    public Point getP1() {
        return point1;
    }

    public Point getP2() {
        return point2;
    }

    public Point getP3() {
        return point3;
    }

    public Point getP4() {
        return point4;
    }
}

class Trapezoid extends Quadrilateral {
    Trapezoid(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    public double calculateArea() {
        double base1 = Math.sqrt(Math.pow(getP2().getX() - getP1().getX(), 2) +
                Math.pow(getP2().getY() - getP1().getY(), 2));
        double base2 = Math.sqrt(Math.pow(getP3().getX() - getP4().getX(), 2) +
                Math.pow(getP3().getY() - getP4().getY(), 2));
        double height = Math.abs(getP2().getY() - getP1().getY());
        double result = 0.5 * (base1 + base2) * height;

        return result;
    }
}

class Parallelogram extends Quadrilateral {
    Parallelogram(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    public double calculateArea() {
        double base = Math.sqrt(Math.pow(getP2().getX() - getP1().getX(), 2) +
                Math.pow(getP2().getY() - getP1().getY(), 2));
        double height = Math.abs(getP2().getY() - getP1().getY());
        double result = base * height;

        return result;
    }
}

class Rectangle extends Quadrilateral {
    Rectangle(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    public double calculateArea() {
        double width = Math
                .sqrt(Math.pow(getP2().getX() - getP1().getX(), 2) + Math.pow(getP2().getY() - getP1().getY(), 2));
        double length = Math
                .sqrt(Math.pow(getP3().getX() - getP2().getX(), 2) + Math.pow(getP3().getY() - getP2().getY(), 2));
        double result = length * width;

        return result;
    }
}

class Square extends Quadrilateral {
    Square(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    public double calculateArea() {
        double side = Math
                .sqrt(Math.pow(getP1().getX() - getP2().getX(), 2) + Math.pow(getP1().getY() - getP2().getY(), 2));
        double result = side * side;

        return result;
    }
}

public class QuadrilateralInheritance {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        // Declare Scanner Variables
        Scanner inputX = new Scanner(System.in);
        Scanner inputY = new Scanner(System.in);

        // Prompt to enter each pairs of cordinates
        System.out.print("\nEnter the coordinates for point 1 (x1): ");
        double x1 = inputX.nextDouble();
        System.out.print("Enter the coordinates for point 1 (y1): ");
        double y1 = inputY.nextDouble();
        System.out.print("Enter the coordinates for point 2 (x2): ");
        double x2 = inputX.nextDouble();
        System.out.print("Enter the coordinates for point 2 (y2): ");
        double y2 = inputY.nextDouble();
        System.out.print("Enter the coordinates for point 3 (x3): ");
        double x3 = inputX.nextDouble();
        System.out.print("Enter the coordinates for point 3 (y3): ");
        double y3 = inputY.nextDouble();
        System.out.print("Enter the coordinates for point 4 (x4): ");
        double x4 = inputX.nextDouble();
        System.out.print("Enter the coordinates for point 4 (y4): ");
        double y4 = inputY.nextDouble();

        // Display Cordinates
        System.out.printf("\nCordinate 1: (%.1f , %.1f)", x1, y1);
        System.out.printf("\nCordinate 2: (%.1f , %.1f)", x2, y2);
        System.out.printf("\nCordinate 3: (%.1f , %.1f)", x3, y3);
        System.out.printf("\nCordinate 4: (%.1f , %.1f)", x4, y4);
        System.out.println(); // New Line

        // Create objects of the derived classes and call their methods.
        Point p1 = new Point(x1, y1); // Coordinate 1
        Point p2 = new Point(x2, y2); // Coordinate 2
        Point p3 = new Point(x3, y3); // Coordinate 3
        Point p4 = new Point(x4, y4); // Coordinate 4

        // Calculate and Display Area of Shapes
        Trapezoid trapezoid = new Trapezoid(p1, p2, p3, p4);
        System.out.printf("\nTrapezoid Area: %.2f", trapezoid.calculateArea());

        Parallelogram parallelogram = new Parallelogram(p1, p2, p3, p4);
        System.out.printf("\nParallelogram Area: %.2f", parallelogram.calculateArea());

        Rectangle rectangle = new Rectangle(p1, p2, p3, p4);
        System.out.printf("\nRectangle Area %.2f", rectangle.calculateArea());

        Square square = new Square(p1, p2, p3, p4);
        System.out.printf("\nSquare Area: %.2f", square.calculateArea());

        // Create Graph
        System.out.print("\n\nGRAPH ( width: 100 | height:50)");
        System.out.println();
        for (int i = 0; i < 50; i++) {
            System.out.printf("%-5d", i);
            for (int j = 0; j < 100; j++) {
                if (j == x1) {
                    if (i == y1) {
                        System.out.print("x");
                    }
                }
                if (j == x2) {
                    if (i == y2) {
                        System.out.print("x");
                    }
                }
                if (j == x3) {
                    if (i == y3) {
                        System.out.print("x");
                    }
                }
                if (j == x4) {
                    if (i == y4) {
                        System.out.print("x");
                    }
                }
                System.out.print("┼");
            }
            System.out.println();
        }

        // End of program prompt
        System.out.println("Thank you for using the Quadrilateral application.\n"
                + "Time of calculation is " + java.time.LocalDate.now() + " | " + java.time.LocalTime.now());
        // Exit program
        System.exit(0);
    }
}