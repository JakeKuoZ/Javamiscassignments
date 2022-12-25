package Assignment6;

public class testdate {
    public static void main(String[] args) {
        String inputTimeString = "15:23";
        if (!inputTimeString.matches("^([0-9]|0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$")){
            System.out.println("Invalid time string: " + inputTimeString);
        }else{
            System.out.println("right time");
        }
    }



}
