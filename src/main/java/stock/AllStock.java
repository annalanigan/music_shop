package stock;

public abstract class AllStock implements ISell{

    private double buyPrice;
    private double sellPrice;
    private String description;

    public AllStock(double inputBuy, double inputSell, String inputDescription){
        this.buyPrice = inputBuy;
        this.sellPrice = inputSell;
        this.description = inputDescription;
    }

    public double calculateMarkup(){
        return sellPrice - buyPrice;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String getDescription(){
        return this.description;
    }

}
