public class TestStock {
    public static void main(String[] args) {
        Stock s = new Stock("ORCL","Oracle Corporation", 34.5,34.35);
        double result = s.getChangePercent();
        System.out.println(Math.round(result) + "%");
    }
}
