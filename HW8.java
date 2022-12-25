public class HW8 {
    public static void main(String[] args) {

        double x, y, x1, y1, x2, y2, x3, y3;
        double r = 6371.01;
        //Atlanta
        x = 33.7489954;
        y = -84.3879824;
        //Charlotte
        x1 = 35.2270869;
        y1 = -80.8431267;
        //Savannah
        x2 = 32.0835407;
        y2 = -81.0998342;
        //Orlando
        x3 = 28.5383355;
        y3 = -81.3792365;
        //d = r * (Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) + Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2))*
        //                Math.cos(Math.toRadians(y1 - y2))));

        double side, side1, side2, side3, side4;
        //Distance from Atlanta to Charlotte
        side = r * (Math.acos(Math.sin(Math.toRadians(x)) * Math.sin(Math.toRadians(x1)) + Math.cos(Math.toRadians(x)) * Math.cos(Math.toRadians(x1)) *
                Math.cos(Math.toRadians(y - y1))));
        //Distance from Charlotte to Savannah
        side1 = r * (Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) + Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) *
                Math.cos(Math.toRadians(y1 - y2))));
        //Distance from Savannah to Orlando
        side2 = r * (Math.acos(Math.sin(Math.toRadians(x2)) * Math.sin(Math.toRadians(x3)) + Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(x3)) *
                Math.cos(Math.toRadians(y2 - y3))));
        //Distance from Orlando to Atlanta
        side3 = r * (Math.acos(Math.sin(Math.toRadians(x3)) * Math.sin(Math.toRadians(x)) + Math.cos(Math.toRadians(x3)) * Math.cos(Math.toRadians(x)) *
                Math.cos(Math.toRadians(y3 - y))));
        //Distance from Charlotte to Orlando
        side4 = r * (Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x3)) + Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x3)) *
                Math.cos(Math.toRadians(y1 - y3))));

//        s = (side + side1 + side2) / 2;
//        area = Math.pow(s * (s - side) * (s - side1) * (s - side2), 0.5);
        double s = (side + side3 + side4) / 2;
        double s1 = (side1 + side2 + side4) / 2;
        double area = Math.pow(s * (s - side) * (s - side3) * (s - side4), 0.5);
        double area1 = Math.pow(s1 * (s1 - side1) * (s1 - side2) * (s1 - side4), 0.5);
        double totalArea = area + area1;
        System.out.println("This program calculate area within four cities (Atlanta,Charlotte,Savannah,Orlando) assignment 4.3");
        System.out.println();
        System.out.println("Distance from Atlanta to Charlotte: " + side);
        System.out.println("Distance from Charlotte to Savannah: " + side1);
        System.out.println("Distance from Savannah to Orlando: " + side2);
        System.out.println("Distance from Orlando to Atlanta: " + side3);
        System.out.println();
        System.out.println("Area within four cities(Atlanta,Charlotte,Savannah,Orlando) is: ");
        System.out.println(area + " (half triangle)" + " + " + area1 + " (second half triangle) " + " = " + totalArea);
        //System.out.printf("%f %f %f %f %f",side,side1,side2,side3,side4);
    }
}
