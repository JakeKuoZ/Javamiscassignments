package Assignment6;

import java.util.Scanner;

public class TestPerson {

    private static String errorMessage = "  vc";

    public static void main(String[] args) {
        System.out.println("""
                Assignment 11.2
                This program create desired class include:
                1.Person 2.Student 3.Employee 4.Staff 5.Faculty
                For email,date,office hour, followed rules by regular expression.""");
        System.out.println();
        run();

    }


    public static void run(){


        while (true) {
            try {
                System.out.println("""
                        What class do you want to create?
                        '1.Person 2.Student 3.Employee 4.Staff 5.Faculty'
                        Enter 1 number corresponding to desired class. Or class name only
                        Enter 'q' to quit.""");
                Scanner scanner = new Scanner(System.in);
                String choice = scanner.nextLine();
                if (choice.isEmpty()) {
                    errorMessage =
                            "Choice can not be empty";
                    Exception e = new Exception(errorMessage);
                    throw e;
                }
                if(choice.equals("q")){
                    System.out.println("Quit program");
                    System.exit(0);
                }
                if(choice.equalsIgnoreCase("1")||choice.equalsIgnoreCase("Person")){
                    while(true) {
                        System.out.println("Person class have created," +
                                "Enter input in order:" +
                                "\n'ID name address phoneNumber email'");
                        int inputlmt = 0;
                        try {
                            String[] inputlist = new String[5];
                            Scanner scanner1 = new Scanner(System.in);
                            while(inputlmt < 5){
                                String input = scanner1.nextLine();
                                inputlist[inputlmt] = input;
                                inputlmt++;
                            }
                            String id = inputlist[0];
                            String name = inputlist[1];
                            String address = inputlist[2];
                            String phoneNumber = inputlist[3];
                            String email = inputlist[4];
                            Person person = new Person(id,name,address,phoneNumber,email);
                            System.out.println(person);
                            System.out.println("Do you wish to continue? " +
                                    "\nEnter y to continue other to Back to main menu");
                            Scanner scanner2 = new Scanner(System.in);
                            String flag = scanner2.nextLine();
                            if(!flag.equals("y")){
                                System.out.println("Back to main menu");
                                break;
                            }
                        }catch (ClientException e){
                            System.out.println("One or more input are invalid. " + e.getErrMsg());
                            System.out.println("Do you wish to continue? " +
                                    "\nEnter y to continue other to Back to main menu");
                            Scanner scanner1 = new Scanner(System.in);
                            String flag = scanner1.next();
                            if(!flag.equals("y")){
                                System.out.println("Back to main menu");
                                break;
                            }
                        }
                    }

                }else if(choice.equalsIgnoreCase(("2"))||choice.equalsIgnoreCase("Student")){

                    while(true) {
                        Person student = new Student();
                        System.out.println("""
                                Student class have created,Enter individual input in order:
                                'ID name address phoneNumber email status'
                                Note:Status are 1 to 4 number represent as :
                                '1.Freshman','2.Sophomore','3.Junior','4.Senior'""");
                        int inputlmt = 0;
                        try {
                            String[] inputlist = new String[6];
                            Scanner scanner1 = new Scanner(System.in);
                            while(inputlmt < 6){
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
//                            ((Student) student).setStudent(id,name,address,phoneNumber,email,status);
                            System.out.println(student);
                            System.out.println("Do you wish to continue? " +
                                    "\nEnter y to continue other to Back to main menu");
                            Scanner scanner2 = new Scanner(System.in);
                            String flag = scanner2.nextLine();
                            if(!flag.equals("y")){
                                System.out.println("Back to main menu");
                                break;
                            }
                        }catch (Exception e){
                            System.out.println("One or more input are invalid. " + student.getErrorMessage());
                            System.out.println("Do you wish to continue? " +
                                    "\nEnter y to continue other to Back to main menu");
                            Scanner scanner1 = new Scanner(System.in);
                            String flag = scanner1.next();
                            if(!flag.equals("y")){
                                System.out.println("Back to main menu");
                                break;
                            }
                        }
                    }
                }else if(choice.equalsIgnoreCase(("3"))||choice.equalsIgnoreCase("Employee")){

                    while(true) {
                        System.out.println("Employee class have created," +
                                "Enter individual input followed by ENTER in order:" +
                                "\n'ID name address phoneNumber email office salary hireDate'" +
                                "\nNote:For hire date followed format MM/DD/YYYY");
                        Employee employee  = new Employee();
                        int inputlmt = 0;
                        try {
                            String[] inputlist = new String[8];
                            Scanner scanner1 = new Scanner(System.in);
                            while(inputlmt < 8){
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
                            //employee.setEmp(id,name,address,phoneNumber,email,office,salary,date);
                            System.out.println(employee);
                            System.out.println("Do you wish to continue? " +
                                    "\nEnter y to continue other to Back to main menu");
                            Scanner scanner2 = new Scanner(System.in);
                            String flag = scanner2.nextLine();
                            if(!flag.equals("y")){
                                System.out.println("Back to main menu");
                                break;
                            }
                        }catch (Exception e){
                            System.out.println("One or more input are invalid. "+ e.getMessage());
                            System.out.println("Do you wish to continue? " +
                                    "\nEnter y to continue other to Back to main menu");
                            Scanner scanner1 = new Scanner(System.in);
                            String flag = scanner1.nextLine();
                            if(!flag.equals("y")){
                                System.out.println("Back to main menu");
                                break;
                            }
                        }
                    }
                }else if(choice.equalsIgnoreCase(("4"))||choice.equalsIgnoreCase("staff")){

                    while(true) {
                        System.out.println("""
                                Staff class have created \s
                                Enter individual input followed by ENTER in order:
                                'ID name address phoneNumber email office salary
                                hireDate title'
                                Note:For hire date followed format MM/DD/YYYY""");
                        Staff staff = new Staff();
                        int inputlmt = 0;
                        try {
                            String[] inputlist = new String[9];
                            Scanner scanner1 = new Scanner(System.in);
                            while(inputlmt < 9){
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
//                            staff.setStaff(id,name,address,phoneNumber,email,office,salary,date,title);
//                            System.out.println(staff);
                            System.out.println("Do you wish to continue? " +
                                    "\nEnter y to continue other to Back to main menu");
                            Scanner scanner2 = new Scanner(System.in);
                            String flag = scanner2.nextLine();
                            if(!flag.equals("y")){
                                System.out.println("Back to main menu");
                                break;
                            }
                        }catch (Exception e){
                            System.out.println("One or more input are invalid. " + e.getMessage());
                            System.out.println("Do you wish to continue? " +
                                    "\nEnter y to continue other to Back to main menu");
                            Scanner scanner1 = new Scanner(System.in);
                            String flag = scanner1.next();
                            if(!flag.equals("y")){
                                System.out.println("Back to main menu");
                                break;
                            }
                        }
                    }
                }else if(choice.equalsIgnoreCase("5") || choice.equalsIgnoreCase("Faculty")){

                    while(true) {
                        System.out.println("""
                                Faculty class have created,Enter individual input followed by ENTER in order:
                                'ID name address phoneNumber email office salary date officeHour rank'
                                Note:For hire date followed format MM/DD/YYYY
                                Rank level represent as 1 to 4 as:
                                '1.Instructor,2.Assistant Professor,3.Associate Professor,4.Professor'""");
                        Faculty faculty = new Faculty();
                        int inputlmt = 0;
                        try {
                            String[] inputlist = new String[10];
                            Scanner scanner1 = new Scanner(System.in);
                            while(inputlmt < 10){
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
//                            faculty.setFaculty(id,name,address,phoneNumber,email,office,
//                                    salary,date,officeHour,rank);
                            System.out.println(faculty);
                            System.out.println("Do you wish to continue? " +
                                    "\nEnter y to continue other to quit");
                            Scanner scanner2 = new Scanner(System.in);
                            String flag = scanner2.nextLine();
                            if(!flag.equals("y")){
                                System.out.println("Program quit");
                                break;
                            }
                        }catch (Exception e){
                            System.out.println("One or more input are invalid. " + e.getMessage());
                            System.out.println("Do you wish to continue? " +
                                    "\nEnter y to continue other to Back to main menu");
                            Scanner scanner1 = new Scanner(System.in);
                            String flag = scanner1.next();
                            if(!flag.equals("y")){
                                System.out.println("Back to main menu");
                                break;
                            }
                        }
                    }
                }else{
                    errorMessage = "Choice can not be other than " +
                            "\n'1.Person 2.Student 3.Employee 4.Staff 5.Faculty'";
                    Exception e = new Exception(errorMessage);
                    throw e;
                }

            } catch (Exception e) {
                System.out.println("Entered invalid input" +
                        "\nEnter number or words to create new class" + "\n"+
                        errorMessage);
                System.out.println();
                System.out.println("Do you wish to continue?" +
                        "\nEnter 'y' to continue 'q' to quit");
                Scanner scanner3 = new Scanner(System.in);
                String flag = scanner3.next();
                if(flag.equals("y")){
                    run();
                }else if(flag.equals("q")){
                    System.out.println("Program quit");
                    System.exit(0);
                }
            }
        }
    }
    }

