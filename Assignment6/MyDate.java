package Assignment6;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate {
    public int month;
    public int day;
    public int year;
    public String date;

    public MyDate(){
        GregorianCalendar calendar = new GregorianCalendar();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);

}

    public MyDate(int month,int day,int year){
        this.date = getDate(month,day,year);
    }

    public MyDate(long elapsedTime){
        setDate(elapsedTime);
    }

    public int getYear() {
        return year;
    }

    public String getDate(int month,int day,int year ){
        this.month = month;
        this.day = day;
        this.year = year;
        String date = Integer.toString(month) + "/" + Integer.toString(day) + "/" + Integer.toString(year);
        return date;
    }
    /** Return month */
    public String getMonth() {
        String m = String.valueOf(month + 1);
        return (month < 10 ? "0" + m : m);
    }

    /** Return day */
    public String getDay() {
        String d = String.valueOf(day);
        return (day < 10 ? "0" + d : d);
    }

    public void setDate1(int year, int month ,int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setDate(long elapsedTime){
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        year = calendar.get(GregorianCalendar.YEAR);
        month = calendar.get(GregorianCalendar.MONTH);
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }

    @Override
    public String toString() {
        return date + " ";
    }
}
