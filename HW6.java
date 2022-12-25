import java.util.Scanner;

public class HW6 {
    public static void main(String[] args) {
        //assignment 2 3.27
        double x , y ,m;

        Scanner scanner = new Scanner(System.in);
        System.out.println("This program tells if entered point fall into triangle on the graph within (0,100) and (200,0) ");
        System.out.println("Enter a point's x- and y- coordinates separate by space: ");
        x = scanner.nextDouble();
        y = scanner.nextDouble();

        m = (y-100) / x;
        //condition if entered point is in triangle
        if((x == 0 && y <= 100) || (y == 0 && x <= 200)){ // if point in range
            System.out.println("The point entered is in the triangle.");
        }else if((x == 0 && y > 100) || (y == 0 && x > 200)){ // if point not in range
            System.out.println("Given point has one value x or y is equal to 0, and also larger than(0,100),(200,0) which is not in the triangle");
            System.out.println("The point entered is not in the triangle.");
        }else if(m < -0.5 && y > 0 && x > 0){  // if slope is less than -1/2
            System.out.println("Value of m = : " + m);
            System.out.println("Since the given line slope is -1/2 hence every given point has slope smaller than -1/2 is in the triangle");
            System.out.println("The point entered is in the triangle.");
        }else{ // final condition doesn't match any above.
            System.out.println("Value of m = : " + m);
            System.out.println("Since the given line slope is -1/2 hence every given point has slope smaller than -1/2 is in the triangle");
            System.out.println("The point entered is not in the triangle.");
        }
    }
}
