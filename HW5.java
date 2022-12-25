import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        //Assignment 2 3.3
        double a,b,c,d,e,f,x,y,z;
        x = 0;
        y = 0;
        z = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program calculate linear equation x , y by enter 6 value. Assignment 2 - 3.3");
        System.out.println("Enter a, b, c, d, e, f, separate by space: ");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        d = scanner.nextDouble();
        e = scanner.nextDouble();
        f = scanner.nextDouble();

        z = (a * d) - (b * c);
//        x = ((e * d) - (b * f)) / ((a * d) - (b * c));
//        y = ((a * f) - (e * c)) / ((a * d) - (b * c));

        if(z == 0){
            System.out.println("The equation has no solution because denominator ad - bc = 0");
        }else{
            x = ((e * d) - (b * f)) / ((a * d) - (b * c));
            y = ((a * f) - (e * c)) / ((a * d) - (b * c));
            System.out.println("Result of input value " + a + " " + b + " " + c + " " + d + " " + e + " " + f + " : x = " + x + " y = " + y);
        }

    }
}
