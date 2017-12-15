package stock.stockitems;

import stock.AllStock;

public class Violinstring extends AllStock{

    private String brand;

    public Violinstring(double inputBuy, double inputSell, String brand) {
        super(inputBuy, inputSell);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}
