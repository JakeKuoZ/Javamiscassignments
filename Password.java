public class Password {
    private final int lengthOfPassword = 8;
    private final int minimalPassword = 2;
    private String password;

    private String errorMessage;

    public Password(){
    }

    public Password(String password) throws Exception {

        setPassword(password);
    }

    public String getPassword() {
        return password;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setPassword(String password) throws Exception {
        if ((!isValid(password))) {
            Exception e = new Exception(errorMessage);
            throw e;
        }
        if(!(isValidlength(password))) {
            Exception e = new Exception(errorMessage);
            throw e;
        }
        if(!(hasTwoDigits(password))){
            Exception e = new Exception(errorMessage);
            throw e;
        }
        this.password = password;
    }

    public  boolean isValid(String password){
        for (int i = 0; i < password.length() ; i++) {
            if(!(Character.isLetterOrDigit(password.charAt(i)))){
                errorMessage =
                        "Password cannot be other than letters and integers digit.";
                return false;
            }
        }
        return true;

    }

    public boolean isValidlength(String password){
        if(password.length() < lengthOfPassword){
            errorMessage =
                    "Password at least 8 digits long.";
            return false;
        }
            return true;
        }


    public boolean hasTwoDigits(String password) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            if(Character.isDigit(password.charAt(i))){
                count++;
            }
        }
        if(count < minimalPassword){
            errorMessage =
                    "Password must contains at lease two digits.";
            return false;
        }
        return true;
    }
}
