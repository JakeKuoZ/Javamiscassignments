package Assignment6;

public class test {
    String a;
    String b;
    MyDate myDate = new MyDate();

    test(){

    }

    test(String a , String b){
        setA(a);
    }

    public boolean Valid(String a){
        if(a.equals("wocao")){
            System.out.println("wocao is bad");
            return false;
        }
        return true;
    }

    public void setA(String a) {
        if(Valid(a)){
            this.a = a;
            this.b = b;
        }
    }

    public void setB(String b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "test{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                '}';
    }
}
