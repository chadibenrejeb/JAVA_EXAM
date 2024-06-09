package examen2021.ex1;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Point[] points = new Point[5]; // Create an array to store 5 Point objects

        try {
            for (int i = 0; i < 2; i++) {
                System.out.println("Enter the name:");
                String name = in.next();
                System.out.println("Enter the abs:");
                int abs = in.nextInt();
                System.out.println("Enter the ord:");
                int ord = in.nextInt();

                points[i] = new Point(abs, ord, name); // Create a new Point object and store it in the array

                if (i > 0 && points[i].equals(points[i - 1])) {
                    throw new CoincidentPointsException("The first two points are coincident.");
                }
            }
        } catch (CoincidentPointsException e) {
            System.out.println(e.getMessage());
        }

        Segment seg = new Segment(points[0], points[1]);
        System.out.println(seg.estHorizontale()) ; 
        System.out.println(seg.estVerticale());
    }
}
