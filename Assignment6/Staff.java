package Assignment6;

public class Staff extends Employee{
    String title;

    public Staff() throws Exception {
    }

    public Staff(String ID,String name, String address, String phoneNumber, String email,
                 String office, String salary, String date,String title) throws Throwable {
        super(ID,name, address, phoneNumber, email, office, salary,date);
        setID(ID);
        setName(name);
        setAddress(address);
        setPhoneNumber(phoneNumber);
        setEmail(email);
        setOffice(office);
        setSalary(salary);
        setDate(date);
        setTitle(title);
        isContainsErr();
    }

//    public void setStaff(String ID, String name, String address , String phoneNumber,
//                         String email,String office,String salary,String date,String title) throws Exception {
//        setID(ID);
//        setName(name);
//        setAddress(address);
//        setPhoneNumber(phoneNumber);
//        setEmail(email);
//        setOffice(office);
//        setSalary(salary);
//        setDate(date);
//        setTitle(title);
//        isContainsErr();
//    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws Exception {
        if(isValidtitle(title)) {
            this.title = title;
        }
        else {
            Exception e = new Exception(errorMessage);
            throw e;
        }
    }

    public boolean isValidtitle(String title){
        //Since there are so many job title, so I don't think there is bad input other than empty;
        if(title.isEmpty()){
            errorMessage +=
                    "\nTitle can not be empty";
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", title='" + title + '\'' +
                ", office='" + office + '\'' +
                ", salary='" + salary + '\'' +
                ", hire date= " + date +
                '}';
    }
}
