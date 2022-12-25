package AssignmenTriangle;

public class IllegalTriangelException extends Exception{

        public IllegalTriangelException(double side1,double side2,double side3,String s)
        {
            super(s);
        }
    }
