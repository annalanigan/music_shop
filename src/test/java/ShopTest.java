import org.junit.Before;
import org.junit.Test;
import stock.ISell;
import stock.instruments.*;
import stock.stockitems.Musicstand;
import stock.stockitems.Sheetmusic;
import stock.stockitems.Violinstring;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Flute flute;
    Violin violin;
    Piano piano;
    Musicstand musicstand;
    Violinstring string;
    Sheetmusic sheetMusic;

    @Before
    public void before(){
        shop = new Shop();
        flute = new Flute(100, 200, "Yamaha", FluteType.ALTO);
        violin = new Violin(600, 1000, "Stentor");
        piano = new Piano(4000,6000, "Steinhoven", PianoType.BABYGRAND);
        musicstand = new Musicstand(10,20);
        string = new Violinstring(1, 3, "Jargar");
        sheetMusic = new Sheetmusic(6, 10, "Impromptu no. 3 in G-Flat Major", "Schubert");
    }

    @Test
    public void startsEmpty(){
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void canAddItems(){
        shop.addStock(flute);
        shop.addStock(violin);
        assertEquals(2, shop.stockCount());
    }

    @Test
    public void canRemoveItem(){
        shop.addStock(sheetMusic);
        shop.addStock(string);
        shop.addStock(musicstand);
        shop.removeItem(musicstand);
        assertEquals(2, shop.stockCount());
    }

    @Test
    public void canListItems(){
        shop.addStock(sheetMusic);
        shop.addStock(string);
        shop.addStock(musicstand);
        shop.addStock(violin);
        shop.addStock(piano);
        shop.addStock(flute);
        shop.showItems();
    }

    @Test
    public void canGetTotalBuyPrice(){
        shop.addStock(sheetMusic);
        shop.addStock(string);
        shop.addStock(musicstand);
        shop.addStock(violin);
        shop.addStock(piano);
        shop.addStock(flute);
        assertEquals(2516, shop.totalMarkup(), 0.01);
    }

}
