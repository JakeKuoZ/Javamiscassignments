public class Stock {
    public String symbol;
    public String name;
    public double previousClosingPrice;
    public double currentPrice;

    Stock(String symbol,String name, double previousClosingPrice,double currentPrice){
        this.symbol = symbol;
        this.name = name;
        this.currentPrice = currentPrice;
        this.previousClosingPrice = previousClosingPrice;
    }

    public double getChangePercent(){
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "symbol='" + symbol + '\'' +
                ", name='" + name + '\'' +
                ", previousClosingPrice=" + previousClosingPrice +
                ", currentPrice=" + currentPrice +
                '}';
    }
}

