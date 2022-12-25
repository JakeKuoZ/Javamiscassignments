package Assignment6;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Person {

    String ID;
    String name;
    String address;
    String phoneNumber;
    String email;
    public String errorMessage = " ";
//    public List<Exception> errorList = new ArrayList<Exception>();

    public Person(){
    }

    public Person(String ID,String name, String address , String phoneNumber,String email) throws Exception {
        setID(ID);
        setName(name);
        setAddress(address);
        setPhoneNumber(phoneNumber);
        setEmail(email);
        isContainsErr();
    }

    public String getName() {
        return name;
    }

//    public void setall(String ID,String name, String address , String phoneNumber,String email) throws Exception {
//        setID(ID);
//        setName(name);
//        setAddress(address);
//        setPhoneNumber(phoneNumber);
//        setEmail(email);
//        isContainsErr();
//    }

    public void setName(String name) {
        if(isValidName(name)) {
            this.name = name;
        }
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        if(isValidID(ID)) {
            this.ID = ID;
        }


    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if(isValidAddress(address)) {
            this.address = address;
        }

    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(isValidPhone(phoneNumber)) {
            this.phoneNumber = phoneNumber;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws Exception {
        if(emailValid(email)) {
            this.email = email;
        }
    }



    public boolean isValidName(String name){
        if(name.isEmpty()){
            errorMessage +=
                    "\nPlease enter a name.";
            return false;
        }
        for (int i = 0; i <name.length(); i++) {
            if(!Character.isLetter(name.charAt(i))){
                errorMessage +=
                        "\nName contains letter only";
                return false;
            }
        }
        return true;
    }

    public boolean isValidID(String ID){
        if(ID.isEmpty()){
            errorMessage +=
                    "\nID is required.";
            return false;
        }
        for (int i = 0; i <ID.length() ; i++) {
            if(Character.isLetter(ID.charAt(i))){
                errorMessage +=
                        "\nDigits only for ID";
                return false;
            }
        }
        return true;
    }


    public boolean isValidAddress(String address){
        if(address.isEmpty()){
            errorMessage +=
                    "\nAddress can not be empty.";
            return false;
        }
        return true;
    }

    public boolean isValidPhone(String phoneNumber){
        if(phoneNumber.isEmpty()){
            errorMessage +=
                    "\nPhone number can not be empty";
            return false;
        }
        for (int i = 0; i < phoneNumber.length() ; i++) {
            if(!Character.isDigit(phoneNumber.charAt(i))){
                errorMessage +=
                        "\nPhone number only in numbers";
                return false;
            }
        }
        return true;
    }

    public boolean emailValid(String email){
        boolean pattern =  Pattern.compile("([a-zA-Z0-9]+(?:[._+-][a-zA-Z0-9]+)*)@([a-zA-Z0-9]+(?:[.-][a-zA-Z0-9]+)*[.][a-zA-Z]{2,})")
                .matcher(email).matches();

        if(!pattern){
            errorMessage +=
                    "\nPlease enter valid email";
            return false;
        }
        return true;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setorMessage(String orMessage) {
        this.errorMessage = orMessage;
    }

    public void isContainsErr() throws ClientException {
        if (!errorMessage.equals(" ")) {
            ClientException e = new ClientException();
            e.setErrMsg(errorMessage);
            throw e;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
