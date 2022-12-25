import java.util.Calendar;
import java.util.GregorianCalendar;
public class HW12 {

    public static void main(String[] args) {
        System.out.println("\nAssignment 9.5" + "\nThis program shows current month/day/year and, " +
                "\nelapsed time since January 1,1970");

        GregorianCalendar calender = new GregorianCalendar();

        int month = calender.get(calender.MONTH);
        int dateOfMonth = calender.get(calender.DAY_OF_MONTH);
        int year = calender.get(calender.YEAR);

        System.out.println("\nShows the current date： ");
        System.out.println();
        System.out.println((month + 1) + "/" +
                dateOfMonth + "/"
                + year);

        calender.setTimeInMillis(1234567898765L);

        int month1 = calender.get(calender.MONTH);
        int dateOfMonth1 = calender.get(calender.DAY_OF_MONTH);
        int year1 = calender.get(calender.YEAR);

        System.out.print("\nShows elapsed time since January 1, 1970 set value to " +
                "1234567898765L.");
        System.out.println("\n" + (month1 + 1) + "/" +
                dateOfMonth1 + "/" + year1);

    }


}
