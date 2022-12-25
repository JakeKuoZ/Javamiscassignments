package Assignment6;

public class Faculty extends Employee {
    String office_hour;
    String rank;

    public Faculty(){
    }

    public Faculty(String ID,String name, String address, String phoneNumber, String email,
                   String office, String salary,String date, String office_hour, String rank) throws Exception {
        super(ID,name, address, phoneNumber, email, office, salary,date);
        setID(ID);
        setName(name);
        setAddress(address);
        setPhoneNumber(phoneNumber);
        setEmail(email);
        setOffice(office);
        setSalary(salary);
        setDate(date);
        setOffice_hour(office_hour);
        setRank(rank);
        isContainsErr();
    }

//    public void setFaculty(String ID,String name, String address, String phoneNumber, String email,
//                           String office, String salary ,String date, String office_hour, String rank) throws Exception {
//        setID(ID);
//        setName(name);
//        setAddress(address);
//        setPhoneNumber(phoneNumber);
//        setEmail(email);
//        setOffice(office);
//        setSalary(salary);
//        setDate(date);
//        setOffice_hour(office_hour);
//        setRank(rank);
//        isContainsErr();
//    }

    public String getOffice_hour() {
        return office_hour;
    }

    public void setOffice_hour(String office_hour) throws Exception {
        if(!isValidHour(office_hour)){
            Exception e = new Exception(errorMessage);
            throw e;
        }
        this.office_hour = office_hour;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) throws Exception {
        if(isValidRank(rank)) {
            facultyRank(rank);
        }else {
            Exception e = new Exception(errorMessage);
            throw e;
        }
    }

    public boolean isValidRank(String rank){
        if(rank.isEmpty()){
            errorMessage +=
                    "\nRank can not be empty";
            return false;
        }
        for (int i = 0; i < rank.length() ; i++) {
            if(!Character.isLetterOrDigit(rank.charAt(i))){
                errorMessage +=
                        """

                                Enter valid rank numbers only
                                1.Instructor,2.Assistant Professor,3.Associate Professor,4.Professor""";
            }
        }
        if(Double.parseDouble(rank) > 4 || Double.parseDouble(rank) < 1){
            errorMessage +=
                    "\nFaculty rank have to within range between 1 to 4";
            return  false;
        }
        return true;
    }

    public void facultyRank(String status){
        if(status.equals("1")){
            this.rank = "Instructor";
            System.out.println("Faculty is an instructor");
        }else if(status.equals("2")){
            this.rank = "Assistant Professor";
            System.out.println("Faculty is an Assistant Professor");
        }else if(status.equals("3")){
            this.rank = "Associate Professor";
            System.out.println("Faculty is an Associate Professor");
        }else if(status.equals("4")){
            this.rank = "Professor";
            System.out.println("Faculty is a Professor");
        }
    }

    public boolean isValidHour(String office_hour){
        if (!office_hour.matches("^([0-9]|0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$")){
            errorMessage +=
                    "\nOffice hour is invalid (In 24 hour format Eg.23:59)";
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "office='" + office + '\'' +
                ", salary='" + salary + '\'' +
                ", Hire date=" + date +
                ", office_hour='" + office_hour + '\'' +
                ", \nrank='" + rank + '\'' +
                ", ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
