import java.util.InputMismatchException;
import java.util.Scanner;

public class TestRectangle {

    public TestRectangle(){

    }
    public static void main(String[] args) throws Exception {

        run();
    }

    // run method for test program
    public static void run() throws Exception {
        System.out.println("\nAssignment 9.1");
        System.out.println("This program calculate rectangle with user input width and height.");
        System.out.println("Please press ENTER after each input.");

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nPlease enter width  followed by ENTER:");
            String inputWidth = scanner.nextLine();
            System.out.println("Please enter height followed by ENTER:");
            String inputHeight = scanner.nextLine();
            try {
                Rectangle r = new Rectangle(inputWidth, inputHeight);
                //check validation
                if (r.isValid(inputWidth, inputHeight) && r.isValidNumber(inputWidth, inputHeight)) {
                    System.out.print("Perimeter is: " + inputWidth + " * 2" + " + " + inputHeight + " * 2" +
                            " = ");
                    r.getPerimeter();
                    System.out.println();
                    System.out.print("Area is: " + inputWidth + " * " + inputHeight +
                            " = ");
                    r.getArea();
                    System.out.println("\nDo you wish to repeat? Enter y to continue else quit.");
                    String flagTrigger = scanner.next();
                    if (flagTrigger.equals("y")) {
                        run();
                    } else {
                        break;
                    }
                }
            //if not valid. Solve exception negative number
            } catch (InputMismatchException ex) {
                System.out.println("Please enter number positive and larger than zero: " +
                        "\"" + inputWidth + "\"" + " or " + "\"" + inputHeight +  "\"" +" is not valid.");
                System.out.println("\nDo you wish to repeat? Enter y to continue else quit.");
                Scanner scanner1 = new Scanner(System.in);
                String flagTrigger = scanner.next();
                if (flagTrigger.equals("y")) {
                    run();
                } else {
                    System.exit(0);
                }
                //if not valid. Solve exception things other than integer
            } catch (NumberFormatException ex) {
                System.out.println("Please enter Valid INTEGER values: " + "\"" + inputWidth +"\"" +
                        " or " + "\"" + inputHeight +
                        "\"" + " is not valid integer.");
                System.out.println("\nDo you wish to repeat? Enter y to continue else quit.");
                Scanner scanner1 = new Scanner(System.in);
                String flagTrigger = scanner.next();
                if (flagTrigger.equals("y")) {
                    run();
                } else {
                    System.exit(0);
                }
            }
        }
    }
}
//custom exception class.
    class NotNumberException extends Exception {

        public NotNumberException(String message) {
            super("Invalid width or height please enter Integers only.");

        }
    }

