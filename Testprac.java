import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Testprac {
    public static void main(String[] args) throws Exception {

//        String a = "111";
//        String b = "sadasdasda";
//        String c = "21314141324";
//        int a1 = 0;
//        int b1 =0;
//        int c1 = 0;
//
//
//        System.out.println(valid(a));
//
//    }
//    public static boolean valid(String q) {
//        for (int i = 0; i < q.length(); i++) {
//            if (!Character.isDigit(q.charAt(i))) {
//                return false;
//            }
//        }
//        return true;
//        String email = "bill.zhangk@gmail.com";
//        System.out.println(emailValid(email));
//
//    }
//    public static boolean emailValid(String email){
//        return Pattern.compile("([a-zA-Z0-9]+(?:[._+-][a-zA-Z0-9]+)*)@([a-zA-Z0-9]+(?:[.-][a-zA-Z0-9]+)*[.][a-zA-Z]{2,})")
//                .matcher(email).matches();
//    }
        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        double s = scanner.nextDouble();
        double z = scanner.nextDouble();

        System.out.println("Enter operator");
        Scanner scanner1 = new Scanner(System.in);
        String opera = scanner1.next();

        if (opera.equals("+")) {
            System.out.println(s + z);
        } else if (opera.equals("-")) {
            System.out.println(s - z);
        }else if(opera.equals("/")){
            if(z == 0 || s == 0 ){
                Exception e = new Exception("0 cannot be divided");
                throw e;
            }
            System.out.println(s/z);
        }else if(opera.equals("*")){
            System.out.println( s * z );
        }

    }
}
