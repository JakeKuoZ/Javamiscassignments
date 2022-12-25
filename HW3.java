import java.text.DecimalFormat;
import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        //Assignment 2.15
        //obtain first point input value
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program calculate distance between two points on the graph");
        System.out.println("Enter x1 and y1: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        //obtain second point input value
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter x2 and y2: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        //Calculation of distance
        double distance = (Math.pow(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2),0.5));
        System.out.println("The distance of two point:" + x1 + " " + y1 + " and " + x2 + " " + y2 + " is " + new DecimalFormat("###.##").format(distance));


    }


}
