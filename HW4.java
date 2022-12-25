import java.text.DecimalFormat;
import java.util.Scanner;

public class HW4 {
    //Assignment 2.19
    public static void main(String[] args) {
        double x1, x2, x3, y1, y2, y3;
        double side, side1, side2, s, area;

            Scanner scanner = new Scanner(System.in);
            System.out.println("This program calculate area of triangle by given three points. Result will round up to 1 digit");
            System.out.println("Enter the coordinates of three points separated by spaces like x1 y1 x2 y2 x3 y3: ");

            x1 = scanner.nextDouble();
            y1 = scanner.nextDouble();
            x2 = scanner.nextDouble();
            y2 = scanner.nextDouble();
            x3 = scanner.nextDouble();
            y3 = scanner.nextDouble();
            //find side of triangle
            side = Math.pow(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2), 0.5);
            side1 = Math.pow(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2), 0.5);
            side2 = Math.pow(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2), 0.5);
            s = (side + side1 + side2) / 2;
            area = Math.pow(s * (s - side) * (s - side1) * (s - side2), 0.5);
            System.out.println("s is :" + "(" + side + "+" + side1 + "+" + side2 + ")" + "/ " + "2" + " = "+ s  );
            System.out.println("The area of given point triangle is: " + new DecimalFormat("###.##").format(area));


        }
    }