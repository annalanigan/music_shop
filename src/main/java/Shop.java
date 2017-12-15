import stock.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop(){
        stock = new ArrayList<>();
    }

    public int stockCount() {
        return stock.size();
    }
}
