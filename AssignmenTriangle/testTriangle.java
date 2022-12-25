package AssignmenTriangle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class testTriangle {
    public static void main(String[] args) {
        System.out.println("This program determine if triangle side is valid" +
                "\nwith illegaltriangleexception. Assignment6 12.5");

        run();
    }

    public static void run(){

        try{
            while (true) {
                System.out.println("Enter each side followed by enter");
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter side 1");
                double side1 = scanner.nextDouble();
                System.out.println("Enter side 2");
                double side2 = scanner.nextDouble();
                System.out.println("Enter side 3");
                double side3 = scanner.nextDouble();

                Triangle triangle = new Triangle();

                try {
                    if (triangle.isTriangleValid(side1, side2, side3)) {
                        System.out.println("Side entered is valid");
                        triangle.setSide(side1, side2, side3);
                        double area = triangle.getArea();
                        double perimeter = triangle.getPerimeter();
                        System.out.println("Area of triangle is: " + area + " with side :" + " " + side1 + " " + side2 + " " + side3);
                        System.out.println("Perimeter of triangle is:" + perimeter +" with side :" + " " + side1 + " " + side2 + " " + side3);
                        System.out.println();
                        System.out.println("Do you wish to continue? Enter 'q' to quit other to continue  ");
                        Scanner scanner1 = new Scanner(System.in);
                        String flag = scanner1.next();
                        if(flag.equalsIgnoreCase("q")){
                            System.out.println("Program quit");
                            System.exit(0);
                        }
                    }
                } catch (IllegalTriangelException e) {
                    System.out.println("Side is invalid please try again" + "\n" + e.getMessage());
                    System.out.println("Side you enter: " + side1 + " " + side2 + " " + side3);
                    System.out.println("Do you wish to continue? Enter 'q' to quit other to continue  ");
                    Scanner scanner1 = new Scanner(System.in);
                    String flag = scanner1.next();
                    if(flag.equalsIgnoreCase("q")){
                        System.out.println("Program quit");
                        System.exit(0);
                    }
                }
            }
        }catch(InputMismatchException e){
            System.out.println("Please enter number only" +
                    "\nDo you want to try again? Enter 'y' to repeat other to quit");
            Scanner scanner = new Scanner(System.in);
            String flag = scanner.next();
            if(flag.equalsIgnoreCase("y")){
                run();
            }
            else{
                System.out.println("Program quit");
                System.exit(0);
            }

        }
    }
}
