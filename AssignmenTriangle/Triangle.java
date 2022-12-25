package AssignmenTriangle;

public class Triangle{
    double side1 = 1;
    double side2 = 1;
    double side3 = 1;

    public Triangle(){}

    public Triangle(double side1, double side2, double side3) throws IllegalTriangelException {
        setSide(side1,side2,side3);
    }

    public double getArea(){
        double s = (side1 + side2 + side3)/2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }

    public double getPerimeter(){
        return side1 + side2 + side3;
    }

    public void setSide(double side1,double side2,double side3) throws IllegalTriangelException {
        if(isTriangleValid(side1,side2,side3)){
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
    }

    public boolean isTriangleValid(double side1, double side2, double side3)throws IllegalTriangelException {
        if((side1 + side2) > side3 && (side1 + side3) > side2 && (side2 + side3) > side1) {
            return true;
        }else {
            throw new IllegalTriangelException(side1,side2,side3,"Sides entered cannot form a triangle.");
        }
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }
}
