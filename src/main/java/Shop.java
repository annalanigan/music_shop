import stock.ISell;
import stock.instruments.Flute;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop(){
        stock = new ArrayList<>();
    }

    public int stockCount() {
        return stock.size();
    }

    public void addStock(ISell item) {
        stock.add(item);
    }
}
