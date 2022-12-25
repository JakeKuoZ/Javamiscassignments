import java.util.InputMismatchException;

public class Rectangle {

    private String width;
    private String height;
    public String errorMessage;

    //default constructor
    public Rectangle() {
    }

    //Modified constructor exception will solve at run() method
    public Rectangle(String newWidth, String newHeight) throws Exception {
        try {
            setSide(newWidth, newHeight);
        } catch (InputMismatchException ex) {

        } catch (NumberFormatException ex) {
        }

    }

    //get Area
    public void getArea() {
        try {
            System.out.println(Double.parseDouble(width) * Double.parseDouble(height));
        } catch (NullPointerException ex) {
            System.out.println("Area is not available since INPUT is invalid");
        }
    }

    //get Perimeter
    public void getPerimeter() {
        try {
            System.out.print((2 * Double.parseDouble(width)) + (2 * Double.parseDouble(height)));
        } catch (NullPointerException ex) {
            System.out.println("Perimeter is not available since INPUT is invalid");
        }
    }

    //get method
    public double getWidth() {
        return Double.parseDouble(width);
    }

    public double getHeight() {
        return Double.parseDouble(height);
    }

    //set method with exception
    public void setSide(String width, String height) throws Exception {
        if (isValid(width, height)) {
            if (isValidNumber(width, height)) {
                this.width = width;
                this.height = height;
            }
        }
    }

    // test if negative number
    public boolean isValid(String width, String height) throws NumberFormatException {

            if (Double.parseDouble(width) <= 0 || Double.parseDouble(height) <= 0) {
                throw new InputMismatchException("Enter number positive and larger than 0");
            }
        return true;
    }


    // test if input other than integer
    public boolean isValidNumber(String width, String height) throws NotNumberException {
        char[] charWidth = width.toCharArray();
        char[] charHeight = height.toCharArray();
        StringBuilder a = new StringBuilder();
        int checkFlag = 1;
        try {
            while (checkFlag == 1) {
                for (char c : charWidth) {
                    if (!(Character.isDigit(c))) {
                        a.append(c);
                    }
                }
                for (char c : charHeight) {
                    if (!(Character.isDigit(c))) {
                        a.append(c);
                    }
                }
                if (a.length() != 0) {
                    checkFlag++;
                    throw new NotNumberException("Invalid input");
                }
                checkFlag++;
            }
        } catch (NumberFormatException e) {
            System.out.println("Value you have entered is invalid please input integer only");
            return false;
        }
        return true;
    }

    //toString
    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
