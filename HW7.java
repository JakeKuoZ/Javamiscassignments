import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) {
        //assignment 4.2
        double r = 6371.01;
        double d,x1,y1,x2,y2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("This program calculate distance of two points given as degrees. Assignment 4.2" );
        System.out.println();
        System.out.println("Enter point 1 ( latitude and longitude separate by space) in degrees:");
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();
        System.out.println("Enter point 2 ( latitude and longitude separate by space) in degrees:");
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();
        d = r * (Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) + Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2))*
                Math.cos(Math.toRadians(y1 - y2))));
        System.out.println("The distance between the two points is: " + d + "km");
    }
}
