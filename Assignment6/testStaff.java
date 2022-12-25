package Assignment6;

import java.util.Scanner;

public class testStaff {
    public static void main(String[] args) throws Throwable {
        System.out.println("This program check input validation via super class attribute" +
                "\nAlso shows multi-error message in custom exception class.");
        System.out.println();

        while (true) {
            System.out.println("""
                    Staff class have created \s
                    Enter individual input followed by ENTER in order:
                    'ID name address phoneNumber email office salary
                    hireDate title'
                    Note:For hire date followed format MM/DD/YYYY""");
            int inputlmt = 0;
            try {
                String[] inputlist = new String[9];
                Scanner scanner1 = new Scanner(System.in);
                while (inputlmt < 9) {
                    String input = scanner1.nextLine();
                    inputlist[inputlmt] = input;
                    inputlmt++;
                }
                String id = inputlist[0];
                String name = inputlist[1];
                String address = inputlist[2];
                String phoneNumber = inputlist[3];
                String email = inputlist[4];
                String office = inputlist[5];
                String salary = inputlist[6];
                String date = inputlist[7];
                String title = inputlist[8];
                Person staff = new Staff(id, name, address, phoneNumber, email, office, salary, date, title);
                System.out.println(staff);
                System.out.println("Do you wish to continue? " +
                        "\nEnter y to continue other to quit");
                Scanner scanner2 = new Scanner(System.in);
                String flag = scanner2.nextLine();
                if (!flag.equals("y")) {
                    System.out.println("program quit");
                    break;
                }
            } catch (ClientException e) {
                System.out.println("One or more input are invalid. " + e.getErrMsg());
                System.out.println("Do you wish to continue? " +
                        "\nEnter y to continue other to quit");
                Scanner scanner1 = new Scanner(System.in);
                String flag = scanner1.next();
                if (!flag.equals("y")) {
                    System.out.println("Program quit");
                    break;
                }
            }
        }
    }
}
