import java.util.Scanner;

public class TestPassword {
    public static void main(String[] args) throws Exception {
        System.out.println("Assignment 6.18");
        System.out.println("This program check if input password is valid" +
                "\nIf password invalid make user try again\n");
        System.out.println("Password must be at lease 8 digit characters" +
                "\nPassword must contain only letters and digits." +
                "\nPassword must contain at least two digits");
        System.out.println();
        run();
    }

        public static void run() throws Exception {

            while (true) {
                System.out.println("Please enter password followed by ENTER");
                Scanner scanner = new Scanner(System.in);
                String s = scanner.nextLine();
                Password password = new Password();
                try {
                    password.setPassword(s);
                    System.out.println("Your password is Valid" +
                            "\nyour Password: " + password.getPassword());
                    System.out.println("\nDo you wish to continue? 'y' to continue else to quit." );
                    Scanner scanner1 = new Scanner(System.in);
                    String flag = scanner1.next();
                    if(flag.equals("y")){
                        continue;
                    }
                } catch (Exception e) {
                    System.out.println("Password entered is not valid\n" +
                            password.getErrorMessage() + "\nYour entered: " + s);
                    System.out.println("Do you want to try again? 'y' to try again else to quit");
                    Scanner scanner2 = new Scanner(System.in);
                    String flag = scanner2.next();
                    if(flag.equals("y")){
                        run();
                    }
                    System.out.println("Program quit.");
                    System.exit(0);
                }
            }
        }
    }

