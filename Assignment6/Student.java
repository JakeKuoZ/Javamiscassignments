package Assignment6;

import java.security.spec.ECField;

public class Student extends Person{
    public String status;

    public Student(){
    }

    public Student(String ID,String name, String address,String phoneNumber,String email,String status) throws Exception {
        super(ID,name, address , phoneNumber,email);
        setID(ID);
        setName(name);
        setAddress(address);
        setPhoneNumber(phoneNumber);
        setEmail(email);
        setStatus(status);
        isContainsErr();
    }

//    public void setStudent(String ID,String name, String address,String phoneNumber,String email,String status) throws Exception {
//        setID(ID);
//        setName(name);
//        setAddress(address);
//        setPhoneNumber(phoneNumber);
//        setEmail(email);
//        setStatus(status);
//        isContainsErr();
//    }

    public void setStatus(String status) throws Exception {
        if(isValidstatus(status)) {
            studentStats(status);
        }
//        else{
//            Exception e = new Exception(errorMessage);
//            throw e;
//        }
    }

    public void studentStats(String status){
        if(status.equals("1")){
            this.status = "freshman";
            System.out.println("Student is a freshman");
        }else if(status.equals("2")){
            this.status = "sophomore";
            System.out.println("Student is a sophomore");
        }else if(status.equals("3")){
            this.status = "junior";
            System.out.println("Student is a junior");
        }else if(status.equals("4")){
            this.status = "senior";
            System.out.println("Student is a senior");
        }
    }

    public boolean isValidstatus(String status){
        if(status.isEmpty()){
            errorMessage +=
                    """
                            Status can not be empty
                            Enter student number of year:\s
                            1.freshman 2.sophomore 3.junior 4.senior""";
            return false;
        }
        for (int i = 0; i < status.length(); i++) {
            if(Character.isLetter(status.charAt(i))){
                errorMessage +=
                        """
                                Invalid input
                                Enter student number of year:\s
                                1.freshman 2.sophomore 3.junior 4.senior""";
                return false;
            }
        }

        if(Double.parseDouble(status) > 4 || Double.parseDouble(status) < 1){
            errorMessage +=
                    "\nstudent year have to within range between 1 to 4";
            return  false;
        }

        return  true;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
