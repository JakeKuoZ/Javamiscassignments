package Assignment6;
import java.util.regex.Pattern;

public class Employee extends Person{
    //MyDate hired_date = new MyDate();
    public String office;
    public String salary;
//    private String errorMessage;
    public MyDate date;

    public Employee(){
    }

    public Employee(String ID, String name, String address , String phoneNumber,String email,String office,String salary,String date) throws Exception {
        super(ID,name, address , phoneNumber,email);
        setID(ID);
        setName(name);
        setAddress(address);
        setPhoneNumber(phoneNumber);
        setEmail(email);
        setOffice(office);
        setSalary(salary);
        setDate(date);
        isContainsErr();

    }

    public void setDate(String date) throws Exception {
        if(isValiddateregx(date)) {
            String[] split = date.split("/");
            int year;
            int month;
            int day;
            month = Integer.parseInt(split[0]);
            day = Integer.parseInt(split[1]);
            year = Integer.parseInt(split[2]);
            this.date = new MyDate(month, day, year);
        }else{
            errorMessage +=
                    "\nInvalid date, numbers only followed by format: " +
                            "\nMM/DD/YYYY";
            Exception e = new Exception(errorMessage);
            throw e;
        }
    }


    public static boolean isValiddateregx(String date){
        Pattern pattern = Pattern.compile("^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$");
        return pattern.matcher(date).matches();
    }

//    public void setEmp(String ID, String name, String address , String phoneNumber
//            ,String email,String office,String salary,String date) throws Exception {
//        setID(ID);
//        setName(name);
//        setAddress(address);
//        setPhoneNumber(phoneNumber);
//        setEmail(email);
//        setOffice(office);
//        setSalary(salary);
//        setDate(date);
//    }
//    public MyDate getHired_date() {
//        return hired_date;
//    }

//    public void setHired_date(MyDate hired_date) {
//        if()
//        this.hired_date = hired_date;
//        hired_date.getDay();
//        hired_date.getMonth();
//        hired_date.getYear();
//    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) throws Exception {
        if(!isValidOffice(office)) {
            Exception e = new Exception(errorMessage);
            throw e;

        }
        this.office = office;
    }


    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) throws Exception {
        if(isValidSalary(salary)) {
            this.salary = salary;
        }
        else{
            Exception e = new Exception(errorMessage);
            throw e;
        }
    }

    public boolean isValidSalary(String salary){
        if(salary.isEmpty()){
            errorMessage +=
                    "\nSalary can not be empty";
            return false;
        }
        for (int i = 0; i < salary.length(); i++) {
            if(Character.isLetter(salary.charAt(i))){
                errorMessage +=
                        "\nSalary in numbers only";
                return false;
            }
        }
        if(Double.parseDouble(salary) < 0){
            errorMessage +=
                    "\nSalary can not be negative";
            return false;
        }
        return true;
    }

    public boolean isValidOffice(String office){
        if(office.isEmpty()){
            errorMessage +=
                    "\nOffice can not be empty";
            return false;
        }
        for (int i = 0; i < office.length() ; i++) {
            if(!Character.isLetterOrDigit(office.charAt(i))){
                errorMessage +=
                        "\nOffice name numbers and letters only";
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", office='" + office + '\'' +
                ", salary='" + salary + '\'' +
                ", hire date=" + date +
                '}';
    }
}

