package Assignment6;

import java.util.Scanner;

public class testFaculty {
    public static void main(String[] args) throws Exception {

        System.out.println("This program check input validation via super class attribute" +
                "\nAlso shows multi-error message in custom exception class.");
        System.out.println();

        while (true) {
            System.out.println("""
                    Faculty class have created,Enter individual input followed by ENTER in order:
                    'ID name address phoneNumber email office salary date officeHour rank'
                    Note:For hire date followed format MM/DD/YYYY
                    Rank level represent as 1 to 4 as:
                    '1.Instructor,2.Assistant Professor,3.Associate Professor,4.Professor'""");
            int inputlmt = 0;
            try {
                String[] inputlist = new String[10];
                Scanner scanner1 = new Scanner(System.in);
                while (inputlmt < 10) {
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
                String officeHour = inputlist[8];
                String rank = inputlist[9];
                Person faculty = new Faculty(id, name, address, phoneNumber, email, office, salary, date, officeHour, rank);
                System.out.println(faculty);
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