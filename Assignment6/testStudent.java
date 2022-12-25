package Assignment6;

import java.util.Scanner;

public class testStudent {
    public static void main(String[] args) throws Throwable {
        System.out.println("This program check input validation via super class attribute" +
                "\nAlso shows multi-error message in custom exception class.");
        System.out.println();
        System.out.println("""
                Student class have created,Enter individual input in order:
                'ID name address phoneNumber email status'
                Note:Status are 1 to 4 number represent as :
                '1.Freshman','2.Sophomore','3.Junior','4.Senior'""");
        while (true) {
            int inputlmt = 0;
            try {
                String[] inputlist = new String[6];
                Scanner scanner1 = new Scanner(System.in);
                while (inputlmt < 6) {
                    String input = scanner1.nextLine();
                    inputlist[inputlmt] = input;
                    inputlmt++;
                }
                String id = inputlist[0];
                String name = inputlist[1];
                String address = inputlist[2];
                String phoneNumber = inputlist[3];
                String email = inputlist[4];
                String status = inputlist[5];
                Person student = new Student(id, name, address, phoneNumber, email, status);
                System.out.println(student);
                System.out.println("Do you wish to continue? " +
                        "\nEnter y to continue other to quit");
                Scanner scanner2 = new Scanner(System.in);
                String flag = scanner2.nextLine();
                if (!flag.equals("y")) {
                    System.out.println("Program quit");
                    System.exit(0);
                }
            } catch (ClientException e) {
                System.out.println("One or more input are invalid. " + e.getErrMsg());
                System.out.println("Do you wish to continue? " +
                        "\nEnter y to continue other to quit");
                Scanner scanner1 = new Scanner(System.in);
                String flag = scanner1.next();
                if (!flag.equals("y")) {
                    System.out.println("Program quit");
                    System.exit(0);
                }
            }
        }
    }
}
