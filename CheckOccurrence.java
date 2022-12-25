import java.util.Scanner;

public class CheckOccurrence {

    public static void main(String[] args) {
        System.out.println("Assignment 6.23\n");
        while (true) {
            System.out.println("This program check Occurrences of a specified character"
                    +"\nPlease enter string want to search first then,"
                    +"\nEnter specified character want to check");
            System.out.println();
            System.out.println("Please enter 'y' to continue other to quit: ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            if((!input.equals("y"))) {
                System.out.println("Program quit");
                System.exit(0);
            }
            else if(!(scanner.equals("y"))) {
                System.out.println("Please enter a string want to check: ");
                Scanner scanner1 = new Scanner(System.in);
                String inputString = scanner1.next();
                boolean flag =  true;
                while (flag) {
                    System.out.println("Please enter a character:");
                    Scanner scanner2 = new Scanner(System.in);
                    char inputChar = scanner2.next().charAt(0);

                    System.out.println("The occurrences of: " + "\'" + inputChar + "\'" + " is: " +
                            count(inputString, inputChar) + " in String " + "\'" + inputString + "\'");
                    System.out.println("Do you want to check other character?" +
                            "\nEnter 'y' to continue, other to quit");
                    Scanner scanner3 = new Scanner(System.in);
                    String input2 = scanner3.next();
                    if(input2.equals("y")){
                        System.out.println("Do you want to enter new String? enter 'y' to enter new String"+
                                "\nelse use current String");
                        Scanner scanner4 = new Scanner(System.in);
                        String input3 = scanner4.next();
                        if(input3.equals("y")){
                            break;
                        }else{
                            continue;
                        }
                    }
                    if(!(input2.equals("y"))){
                        flag = false;
                        System.out.println("Program quit");
                        System.exit(0);
                    }
                }
            }
        }

    }

    public static int count(String str, char a) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == a){
                count++;
            }
        }
        return count;
    }

}
