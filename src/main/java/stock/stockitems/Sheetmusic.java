package stock.stockitems;

import stock.AllStock;

public class Sheetmusic extends AllStock{

    private String title;
    private String composer;

    public Sheetmusic(double inputBuy, double inputSell, String title, String composer) {
        super(inputBuy, inputSell);
        this.title = title;
        this.composer = composer;
    }

    public String getTitle() {
        return title;
    }

    public String getComposer() {
        return composer;
    }
}
