import stock.ISell;
import stock.instruments.Flute;
import stock.stockitems.Musicstand;

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

    public void removeItem(ISell item) {
        stock.remove(item);
    }



    public void showItems(){
        int index = 1;
        for (ISell item : stock){
            System.out.println(index + ": " + item.getDescription());
            index++;
        }
    }

    public double totalMarkup() {
        double total = 0;
        for (ISell item : stock){
            total += item.calculateMarkup();
        }
        return total;
    }

    public void removeItemIndex(int index) {
        stock.remove(index);
    }
}
