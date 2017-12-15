package stock.stockitems;

import stock.AllStock;

public class Violinstrings extends AllStock{

    private String brand;

    public Violinstrings(double inputBuy, double inputSell, String brand) {
        super(inputBuy, inputSell);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}
